package com.qust.book.controller;

import com.qust.book.bean.Book;
import com.qust.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    public static final String INDEX = "redirect:/book/manage";
    public static final String UPDATE = "bookUpdate";
    @Autowired
    BookService service;

    @RequestMapping("/manage")
    public String index() {
        return "bookIndex";
    }

    @RequestMapping("/save")
    public String save(Book book) {
        service.saveOrUpdate(book);
        return INDEX;
    }

    @RequestMapping("/del")
    public String delete(int id) {
        service.removeById(id);
        return INDEX;
    }

    @RequestMapping("/dels")
    public String deleteAll(int[] id) {
        for (var i : id) service.removeById(i);
        return INDEX;
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Book> list() {
        return service.list();
    }

    @RequestMapping("/get")
    @ResponseBody
    public Book get(int id) {
        return service.getById(id);
    }

    @RequestMapping("/add")
    public String addPage() {
        return UPDATE;
    }

    @RequestMapping("/upd")
    public ModelAndView updPage(int id) {
        var mv = new ModelAndView(UPDATE);
        mv.addObject("id", id);
        return mv;
    }

    @RequestMapping("/containsType")
    @ResponseBody
    public String containsType(int id) {
        long res = service.query().eq("type", id).count().intValue();
        return String.valueOf(res == 0);
    }
}
