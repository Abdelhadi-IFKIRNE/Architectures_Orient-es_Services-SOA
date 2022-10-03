package com.example.customer_service.Controllers;

import com.example.customer_service.Entities.Customer;
import com.example.customer_service.Repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerRestController {
    private CustomerRepository customerRepository;

    @GetMapping("/customers/all")
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @PostMapping("/customers/new")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }
}
