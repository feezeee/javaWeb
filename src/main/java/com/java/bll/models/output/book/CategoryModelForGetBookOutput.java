package com.java.bll.models.output.book;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoryModelForGetBookOutput {
    @JsonProperty(value = "id")
    public int id;
    @JsonProperty(value = "name")
    public String name;
}
