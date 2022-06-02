package com.example.demo.model;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceBill {
    private final OrderRepository orderRepository;
    public Bill getBill(int number) {
        float coefficientWaiter = 0.1F;
        return convert(orderRepository.getById(number), coefficientWaiter);
    }

    public Bill convert(Order order, float coefficientWaiter) {
        float sumDishes = order.getDishes().stream().map(Dish::getPrice).reduce(Float::sum).orElse(0.0F);
        float sumWaiter = sumDishes * coefficientWaiter;
        float sum = sumWaiter + sumDishes;
        return new Bill(order,sumWaiter,sumDishes,sum);
    }
}
