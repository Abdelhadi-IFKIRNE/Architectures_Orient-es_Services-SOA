package com.example.customer_service.services;

import com.example.customer_service.dtos.CustomerRequestDto;
import com.example.customer_service.dtos.CustomerResponseDto;
import com.example.customer_service.entities.Customer;

import java.util.List;

public interface ServicesCust {
    CustomerResponseDto addCustomer(CustomerRequestDto customerRequestDto);
    CustomerResponseDto getCustomerById(String id);
    List<CustomerResponseDto> getAllCustomers();
}
