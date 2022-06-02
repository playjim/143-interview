package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Bill {
    private Order order;
    private float sumWaiter;
    private float sumDishes;
    private float sum;
}
