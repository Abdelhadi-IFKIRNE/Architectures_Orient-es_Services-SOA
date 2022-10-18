package com.example.customer_service.mappers;

import com.example.customer_service.dtos.CustomerRequestDto;
import com.example.customer_service.dtos.CustomerResponseDto;
import com.example.customer_service.entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel ="spring")
public interface CustomerMapper {
    Customer fromCustomerRequestDto(CustomerRequestDto customerRequestDto);
    CustomerResponseDto fromCustomer(Customer customer);
}
