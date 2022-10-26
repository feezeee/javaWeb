package com.java.api.models.output.book;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

public class GetBookOutput {
    @JsonProperty(value = "id")
    public int id;
    @JsonProperty(value = "name")
    public String name;
    @JsonProperty(value = "description")
    public String description;
    @JsonProperty(value = "price")
    public Double price;
    @JsonProperty(value = "count")
    public int count;
    @JsonProperty(value = "categories")
    public Collection<CategoryModelForGetBookOutput> categories;
}
