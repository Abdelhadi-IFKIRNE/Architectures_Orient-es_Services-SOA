package com.example.bank_account_service.Web;


import com.example.bank_account_service.Dtos.CustomerRequestDto;
import com.example.bank_account_service.Dtos.CustomerResponseDto;
import com.example.bank_account_service.Services.IcustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerRestController {
    private IcustomerService customerService;

    @GetMapping("/customers/all")
    public List<CustomerResponseDto> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @PostMapping("/customers/add")
    public CustomerResponseDto saveCustomer(@RequestBody CustomerRequestDto customerRequestDto){
        return  customerService.saveCustomer(customerRequestDto);
    }

    @PutMapping("/customers/update")
    public CustomerResponseDto updateCustomer(@RequestBody CustomerResponseDto customerResponseDto){
        return  customerService.updateCustomer(customerResponseDto);
    }

    @GetMapping("/customers/{id}")
    public CustomerResponseDto getCustomerById(@PathVariable(name = "id") Long id){
        return customerService.getCustomerById(id);
    }
}
