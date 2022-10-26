package com.customer.demo;

import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Customer getCustomer(Integer id);
    void createCustomer(Customer customer);
}
