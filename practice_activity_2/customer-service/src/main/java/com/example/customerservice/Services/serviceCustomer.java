package com.example.customerservice.Services;

import com.example.customerservice.Dtos.CustomerDtoRequest;
import com.example.customerservice.Dtos.CustomerResponseDto;

import java.util.List;

public interface serviceCustomer {
    CustomerResponseDto addCustomer(CustomerDtoRequest customerDtoRequest);
    CustomerResponseDto getCustomerById(String id);
    List<CustomerResponseDto> getAllCustomers();
}
