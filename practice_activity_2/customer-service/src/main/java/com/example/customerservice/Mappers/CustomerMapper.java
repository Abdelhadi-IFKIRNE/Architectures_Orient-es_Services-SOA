package com.example.customerservice.Mappers;

import com.example.customerservice.Dtos.CustomerDtoRequest;
import com.example.customerservice.Dtos.CustomerResponseDto;
import com.example.customerservice.Entities.Customer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerMapper {

    public Customer fromCustomerRequestDto(CustomerDtoRequest customerDtoRequest){
        Customer customer=new Customer();
        customer.setId(UUID.randomUUID().toString());
        BeanUtils.copyProperties(customerDtoRequest,customer);
        return customer;
    }

    public CustomerResponseDto fromCustomer(Customer customer){
        CustomerResponseDto customerResponseDto=new CustomerResponseDto();
        BeanUtils.copyProperties(customer,customerResponseDto);
        return customerResponseDto;
    }
}
