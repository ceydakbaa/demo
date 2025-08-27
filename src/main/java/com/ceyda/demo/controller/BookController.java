package com.ceyda.demo.controller;


import com.ceyda.demo.entity.Book;
import com.ceyda.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

     @PostMapping("/create")
    public Book create(@RequestBody  Book book ){
        return bookService.create(book);
    }

}
