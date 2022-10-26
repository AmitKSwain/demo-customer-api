package com.customer.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getCustomer(Integer id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public void createCustomer(Customer customer) {
         customerRepository.save(customer);
    }
}
