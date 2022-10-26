package com.java.bll.abstractions;

import com.java.api.models.output.book.GetBookOutput;

import java.util.Collection;

public interface BookService {
    Collection<GetBookOutput> getAll(boolean includeCategories);
}
