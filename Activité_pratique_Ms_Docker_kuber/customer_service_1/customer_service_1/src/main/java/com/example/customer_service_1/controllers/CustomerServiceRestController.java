package com.example.customer_service_1.controllers;

import com.example.customer_service_1.dtos.CustomerRequestDto;
import com.example.customer_service_1.dtos.CustomerResponseDto;
import com.example.customer_service_1.dtos.Invoice;
import com.example.customer_service_1.services.ServicesCust;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api")
public class CustomerServiceRestController {
    private ServicesCust servicesCust;

    @GetMapping("/customers/all")
    public List<CustomerResponseDto> getAllCustomers(){
        return  servicesCust.getAllCustomers();
    }
    @GetMapping("/customers/{id}")
    public CustomerResponseDto getCustomerById(@PathVariable(name = "id") String id){
        return servicesCust.getCustomerById(id);
    }

    @PostMapping("/customers/add")
    public CustomerResponseDto saveCustomer(@RequestBody CustomerRequestDto customerRequestDto){
        return servicesCust.addCustomer(customerRequestDto);
    }

    @GetMapping("/customers/invoices/{id}")
    public List<Invoice> getAllInvoicesCustomer(@PathVariable(name = "id") String id){
        return servicesCust.getInvoicesOfCustomers(id);
    }
}
