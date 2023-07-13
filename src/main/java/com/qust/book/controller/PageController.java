package com.qust.book.controller;

import com.qust.book.mapper.BookMapper;
import com.qust.book.service.BookService;
import com.qust.book.service.TypeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    @Autowired
    BookService bookService;
    @Autowired
    TypeService typeService;

    @RequestMapping("/index")
    public ModelAndView index() {
        var mv = new ModelAndView("index");
        mv.addObject("books", bookService.query().gt("num",0).list());
        mv.addObject("typeMap", typeService.map());
        return mv;
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/usersInfo")
    public String usersInfo() {
        return "usersIndex";
    }

//    todo: delete
    @RequestMapping("/navbar")
    public String navbar() {
        return "navbar";
    }

    @RequestMapping("/assignmentIndex")
    public String assignmentIndex() {
        return "bookIndex";
    }

    @RequestMapping("/layout")
    public String layout() {
        return "layout";
    }
}
