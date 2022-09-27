package com.example.cutomerservice.Web;


import com.example.cutomerservice.Entities.Customer;
import com.example.cutomerservice.Services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerRestController {
    private CustomerService customerService;

    @GetMapping("/customers/all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomer();
    }

    @PostMapping("/customers/save")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable(name = "id") Long id){
        return customerService.getCustomerById(id);
    }
}
