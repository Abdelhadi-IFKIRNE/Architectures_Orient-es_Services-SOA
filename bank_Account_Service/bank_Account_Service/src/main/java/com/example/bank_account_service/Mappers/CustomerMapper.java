package com.example.bank_account_service.Mappers;

import com.example.bank_account_service.Dtos.CustomerResponseDto;
import com.example.bank_account_service.Entities.Customer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
   public CustomerResponseDto fromCustomer(Customer customer){
        CustomerResponseDto customerResponseDto=new CustomerResponseDto();
        BeanUtils.copyProperties(customer,customerResponseDto);
        return customerResponseDto;
    }

   public Customer fromCustomerResponseDto(CustomerResponseDto customerResponseDto){
        Customer customer=new Customer();
        BeanUtils.copyProperties(customerResponseDto,customer);
        return customer;
    }
}
