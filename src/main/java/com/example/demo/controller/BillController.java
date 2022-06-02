package com.example.demo.controller;

import com.example.demo.model.Bill;
import com.example.demo.model.ServiceBill;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BillController {

    private final ServiceBill serviceBill;

    @GetMapping("/bill/{number}")
    Bill getBillByNumber(@PathVariable int number){
        return serviceBill.getBill(number);
    }
}
