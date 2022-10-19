package com.example.invoiceservice1.ControllerRestClient;


import com.example.invoiceservice1.entities.Customer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerRestClient {
    @GetMapping("/customers/{id}")
    Customer getCustomerById(@PathVariable(name = "id") Long id);
    @GetMapping("/customers/all")
    List<Customer> allCustomers();
}
