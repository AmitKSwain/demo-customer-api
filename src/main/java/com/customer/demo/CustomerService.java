package com.customer.demo;

import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Customer getCustomer(String id);
    Boolean createCustomer(Customer customer);
}
