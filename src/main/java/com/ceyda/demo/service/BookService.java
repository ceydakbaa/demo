package com.ceyda.demo.service;


import com.ceyda.demo.entity.Book;
import com.ceyda.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;


    public Book create(Book book) {
        return bookRepository.save(book);
    }




}
