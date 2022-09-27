package com.example.cutomerservice.Services;

import com.example.cutomerservice.Entities.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getAllCustomer();
    public Customer saveCustomer(Customer customer);
    public Customer getCustomerById(Long id);
}
