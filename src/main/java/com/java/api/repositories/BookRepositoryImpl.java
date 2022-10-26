package com.java.api.repositories;

import com.java.api.abstractions.BookRepository;
import com.java.api.models.output.book.GetBookOutput;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
@Component
public class BookRepositoryImpl implements BookRepository {
    private String url;
    public BookRepositoryImpl(){
        url = "http://localhost:8080/api/book";
    }
    public Collection<GetBookOutput> getAll(boolean includeCategories){
        var restTemplate = new RestTemplate();
        return restTemplate.getForObject(url + "?includeCategories=" + includeCategories, Collection.class);
    }
}
