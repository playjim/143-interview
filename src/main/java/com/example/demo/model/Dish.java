package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dish {
    private String name;
    private float price;

    public Dish(String name, float price) {
        this.name = name;
        this.price = price;
    }
}
