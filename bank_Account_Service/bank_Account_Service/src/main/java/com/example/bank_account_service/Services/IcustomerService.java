package com.example.bank_account_service.Services;

import com.example.bank_account_service.Dtos.CustomerRequestDto;
import com.example.bank_account_service.Dtos.CustomerResponseDto;

import java.util.List;

public interface IcustomerService {
     CustomerResponseDto getCustomerById(Long id);
     CustomerResponseDto saveCustomer(CustomerRequestDto customerRequestDto);
     CustomerResponseDto updateCustomer(CustomerResponseDto customerResponseDto);
     List<CustomerResponseDto> getAllCustomers();

     void deleteCustomer(Long id);
}
