package com.example.customerservice.Controllers;

import com.example.customerservice.Dtos.CustomerDtoRequest;
import com.example.customerservice.Dtos.CustomerResponseDto;
import com.example.customerservice.Services.serviceCustomer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class CustomerRestController {
    private serviceCustomer serviceCustomer;

    @GetMapping("/customers/all")
    public List<CustomerResponseDto> getAllCustomers(){
        return  serviceCustomer.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public CustomerResponseDto getCustomerById(@PathVariable(name = "id") String id){
        return  this.serviceCustomer.getCustomerById(id);
    }

    @PostMapping("/customers/add")
    public CustomerResponseDto saveCustomer(@RequestBody CustomerDtoRequest customerDtoRequest){
        return serviceCustomer.addCustomer(customerDtoRequest);
    }
}
