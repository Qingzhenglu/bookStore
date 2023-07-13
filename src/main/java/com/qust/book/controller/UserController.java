package com.qust.book.controller;

import com.qust.book.bean.User;
import com.qust.book.service.IndexService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private IndexService indexService;

    @RequestMapping("/getUserList")
    @ResponseBody
    public List<User> getUserList() {
        return indexService.list();
    }

    @RequestMapping("/del")
    public String del(int id) {
        indexService.removeById(id);
        return "usersIndex";
    }

    @RequestMapping("/add")
    public String add() {
        return "userUpdate";
    }

     @RequestMapping("/upd")
     @ResponseBody
    public ModelAndView upd(int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userUpdate");
        modelAndView.addObject("id", id);
        return modelAndView;
    }

    @RequestMapping("/getUserById")
    @ResponseBody
    public User getUserById(int id) {
        return indexService.getById(id);
    }

    @RequestMapping("/saveUser")
    public String saveUser(@ModelAttribute User user) {
        indexService.saveOrUpdate(user);
        return "redirect:/index";
    }

    @RequestMapping("/userLogin")
    public String userLogin(String name, String password,RedirectAttributes redirectAttributes) {
        var l = indexService.query().eq("name", name).list();
        if (!l.isEmpty() && l.get(0).getPassword().equals(password)){
            var id = l.get(0).getId();
            redirectAttributes.addAttribute("id",id);
            return "redirect:/index";
        }
        return "redirect:/login";
    }

    @RequestMapping("/userRegister")
    public String userRegister(String name, String password) {
        var l = indexService.query().eq("name", name).list();
        User user = new User();
        if (l.isEmpty()) {
            user.setName(name);
            user.setPassword(password);
            indexService.save(user);
            return "redirect:login";
        }
        return "redirect:/register";
    }
}
