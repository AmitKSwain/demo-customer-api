package com.customer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("customer")
public class CustomerController {
    @Autowired
    CustomerService customerServiceImpl;
    @GetMapping
    Customer getCustomer(@PathVariable("id") Integer id ){

        return customerServiceImpl.getCustomer(id);
    }
    @PostMapping
    Integer createCustomer(@RequestBody Customer customer){

        customerServiceImpl.createCustomer(customer);
         return customer.getId();
    }
}
