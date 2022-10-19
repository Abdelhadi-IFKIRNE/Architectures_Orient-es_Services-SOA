package com.example.customer_service_1.persmappers;
import com.example.customer_service_1.dtos.CustomerRequestDto;
import com.example.customer_service_1.dtos.CustomerResponseDto;
import com.example.customer_service_1.entities.Customer;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MapperCustomer {
   public   Customer fromCustomerRequestDto(CustomerRequestDto customerRequestDto){
        Customer customer=new Customer();
        customer.setId(UUID.randomUUID().toString());
        BeanUtils.copyProperties(customerRequestDto,customer);
        return customer;
    }

    public CustomerResponseDto fromCustomer(Customer customer){
       CustomerResponseDto customerResponseDto=new CustomerResponseDto();
       BeanUtils.copyProperties(customer,customerResponseDto);
       return customerResponseDto;
    }

}
