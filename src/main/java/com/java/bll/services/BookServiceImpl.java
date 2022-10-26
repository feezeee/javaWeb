package com.java.bll.services;

import com.java.api.abstractions.BookRepository;
import com.java.api.models.output.book.GetBookOutput;
import com.java.bll.abstractions.BookService;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Collection<GetBookOutput> getAll(boolean includeCategories){
        return bookRepository.getAll(includeCategories);
    }
}
