package com.customer.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getCustomer(String id) {
        return customerRepository.findById()
    }

    @Override
    public Boolean createCustomer(Customer customer) {
        return null;
    }
}
