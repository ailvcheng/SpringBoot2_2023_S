package com.example.springboot_mongo.domin;

import lombok.Data;

@Data
public class Book {
    private int id;
    private String name;
    private String Type;
    private String description;
}
