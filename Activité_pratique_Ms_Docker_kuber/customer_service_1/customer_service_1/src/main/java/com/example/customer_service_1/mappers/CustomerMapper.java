package com.example.customer_service_1.mappers;

import com.example.customer_service_1.dtos.CustomerRequestDto;
import com.example.customer_service_1.dtos.CustomerResponseDto;
import com.example.customer_service_1.entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel ="spring")
public interface CustomerMapper {
    Customer fromCustomerRequestDto(CustomerRequestDto customerRequestDto);
    CustomerResponseDto fromCustomer(Customer customer);
}
