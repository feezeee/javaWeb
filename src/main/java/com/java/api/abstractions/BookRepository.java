package com.java.api.abstractions;

import com.java.api.models.output.book.GetBookOutput;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

public interface BookRepository {
    Collection<GetBookOutput> getAll(boolean includeCategories);
}
