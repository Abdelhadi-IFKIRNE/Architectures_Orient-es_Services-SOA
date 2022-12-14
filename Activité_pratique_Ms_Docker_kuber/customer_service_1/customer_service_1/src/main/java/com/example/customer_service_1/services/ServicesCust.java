package com.example.customer_service_1.services;



import com.example.customer_service_1.dtos.CustomerRequestDto;
import com.example.customer_service_1.dtos.CustomerResponseDto;
import com.example.customer_service_1.dtos.Invoice;

import java.util.List;

public interface ServicesCust {
    CustomerResponseDto addCustomer(CustomerRequestDto customerRequestDto);
    CustomerResponseDto getCustomerById(String id);
    List<CustomerResponseDto> getAllCustomers();
    List<Invoice> getInvoicesOfCustomers(String id);
}
