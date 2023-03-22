package com.example.costumerservice.controller;

import com.example.costumerservice.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    //Get localhost:8080/customers
    @GetMapping
    public List<Customer> findAll(){
        return null;
    }

    @PostMapping
    public int create(@RequestBody Customer customer){
        return 0;
    }
}