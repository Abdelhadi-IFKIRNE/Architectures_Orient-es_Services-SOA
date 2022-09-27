package com.example.bank_account_service.Web;


import com.example.bank_account_service.Dtos.CustomerRequestDto;
import com.example.bank_account_service.Dtos.CustomerResponseDto;
import com.example.bank_account_service.Services.IcustomerService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class CustomerGraphQlController {
    private IcustomerService customerService;

   @QueryMapping
    public List<CustomerResponseDto> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @MutationMapping
    public CustomerResponseDto saveCustomer(@RequestBody CustomerRequestDto customerRequestDto){
        return  customerService.saveCustomer(customerRequestDto);
    }

   @MutationMapping
    public CustomerResponseDto updateCustomer(@RequestBody CustomerResponseDto customerResponseDto){
        return  customerService.updateCustomer(customerResponseDto);
    }

    @QueryMapping
    public CustomerResponseDto getCustomerById(@PathVariable(name = "id") Long id){
        return customerService.getCustomerById(id);
    }
}
