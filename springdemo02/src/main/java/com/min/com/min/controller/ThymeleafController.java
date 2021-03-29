package com.min.com.min.controller;

import com.min.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","<h1>min-code</h1>");
        return "thymeleaf/index";
    }

    @RequestMapping("/book")
    public String book(Model model){
        Book book = new Book();
        book.setName("兄弟");
        book.setAuthor("余华");
        model.addAttribute("book",book);
        return "thymeleaf/book";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "thymeleaf/welcome";
    }
}
