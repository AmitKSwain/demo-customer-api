package com.customer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping
    Customer getCustomer(@PathVariable("id") Integer id ){

        return customerService.getCustomer(id);
    }
    @PostMapping
    Integer createCustomer(@RequestBody Customer customer){

         customerService.createCustomer(customer);
         return customer.getId();
    }
}
