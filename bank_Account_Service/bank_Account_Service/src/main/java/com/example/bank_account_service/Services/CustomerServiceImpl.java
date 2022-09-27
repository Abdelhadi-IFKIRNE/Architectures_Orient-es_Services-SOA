package com.example.bank_account_service.Services;

import com.example.bank_account_service.Dtos.CustomerRequestDto;
import com.example.bank_account_service.Dtos.CustomerResponseDto;
import com.example.bank_account_service.Entities.Customer;
import com.example.bank_account_service.Mappers.CustomerMapper;
import com.example.bank_account_service.Repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class CustomerServiceImpl implements IcustomerService {
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;
    @Override
    public CustomerResponseDto getCustomerById(Long id) {
        return customerMapper.fromCustomer(customerRepository.findById(id).
                orElseThrow(()->new RuntimeException("Customer not found exception")));
    }

    @Override
    public CustomerResponseDto saveCustomer(CustomerRequestDto customerRequestDto) {
        Customer customer=new Customer();
        customer.setEmail(customerRequestDto.getEmail());
        customer.setName(customerRequestDto.getName());
        return customerMapper.fromCustomer(customerRepository.save(customer));
    }

    @Override
    public CustomerResponseDto updateCustomer(CustomerResponseDto customerResponseDto) {
        Customer customer=customerRepository.findById(customerResponseDto.getId())
                .orElseThrow(()->new RuntimeException("Customer not found exception"));
        customer.setName(customerResponseDto.getName());
        customer.setEmail(customerResponseDto.getEmail());
        return customerMapper.fromCustomer(customerRepository.save(customer));
    }

    @Override
    public List<CustomerResponseDto> getAllCustomers() {
        return customerRepository.findAll().stream().map(customer -> customerMapper.fromCustomer(customer))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteCustomer(Long id){
        customerRepository.deleteById(id);
    }
}
