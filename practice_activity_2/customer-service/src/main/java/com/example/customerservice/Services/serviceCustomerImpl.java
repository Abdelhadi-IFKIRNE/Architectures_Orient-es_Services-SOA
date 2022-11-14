package com.example.customerservice.Services;

import com.example.customerservice.Dtos.CustomerDtoRequest;
import com.example.customerservice.Dtos.CustomerPages;
import com.example.customerservice.Dtos.CustomerResponseDto;
import com.example.customerservice.Entities.Customer;
import com.example.customerservice.Mappers.CustomerMapper;
import com.example.customerservice.Repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class serviceCustomerImpl implements serviceCustomer {
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;
    @Override
    public CustomerResponseDto addCustomer(CustomerDtoRequest customerDtoRequest) {
        return customerMapper.fromCustomer(customerRepository.save(customerMapper.fromCustomerRequestDto(customerDtoRequest)));
    }

    @Override
    public CustomerResponseDto getCustomerById(String id) {
        return customerMapper.fromCustomer(customerRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Customer not found exception...!")));
    }

    @Override
    public List<CustomerResponseDto> getAllCustomers() {
        return customerRepository.findAll().stream().map(customer -> customerMapper.fromCustomer(customer))
                .collect(Collectors.toList());
    }

    @Override
    public CustomerPages getCustomerPages(String id, int page, int size) {
        CustomerPages customerPages=new CustomerPages();
        Page<Customer> customerPage=customerRepository.findByIdContains(id, PageRequest.of(page, size));
        List<CustomerResponseDto> customerResponseDtos=customerPage.stream().map(customer -> customerMapper.fromCustomer(customer)).collect(Collectors.toList());
        customerPages.setNbrPages(customerPage.getTotalPages());
        customerPages.setCustomers(customerResponseDtos);
        return customerPages;
    }
}
