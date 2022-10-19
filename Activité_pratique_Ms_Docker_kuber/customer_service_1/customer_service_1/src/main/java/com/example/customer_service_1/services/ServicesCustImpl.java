package com.example.customer_service_1.services;


import com.example.customer_service_1.Repositories.CustomerRepository;
import com.example.customer_service_1.dtos.CustomerRequestDto;
import com.example.customer_service_1.dtos.CustomerResponseDto;
import com.example.customer_service_1.entities.Customer;

import com.example.customer_service_1.persmappers.MapperCustomer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class ServicesCustImpl implements ServicesCust {
    private CustomerRepository customerRepository;
    private MapperCustomer customerMapper;

    @Override
    public CustomerResponseDto addCustomer(CustomerRequestDto customerRequestDto) {
        return customerMapper.fromCustomer(customerRepository.save(customerMapper.fromCustomerRequestDto(customerRequestDto)));
    }

    @Override
    public CustomerResponseDto getCustomerById(Long id) {
        return customerMapper.fromCustomer(customerRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Customer not found exception")));
    }

    @Override
    public List<CustomerResponseDto> getAllCustomers() {
        List<Customer> customers=customerRepository.findAll();
       return customers.stream().map(customer -> customerMapper.fromCustomer(customer)).collect(Collectors.toList());
    }
}
