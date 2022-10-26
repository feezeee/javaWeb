package com.java.web.controllers;

import com.java.bll.abstractions.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book")
    public String book(Model model){
        var test = bookService.getAll(true);
        model.addAttribute("title", "test title");
        return "book";
    }
}
