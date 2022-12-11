package com.example.customerservice.Controllers;

import com.example.customerservice.Dtos.CustomerDtoRequest;
import com.example.customerservice.Dtos.CustomerPages;
import com.example.customerservice.Dtos.CustomerResponseDto;
import com.example.customerservice.Services.serviceCustomer;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin("*")
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
    @GetMapping("/customers/pages")
    public CustomerPages getCustomerPages(@RequestParam(name = "id",defaultValue = "") String id,
                                          @RequestParam(name = "page",defaultValue = "0") int page,
                                          @RequestParam(name = "size",defaultValue = "5") int size){
        return serviceCustomer.getCustomerPages(id, page, size);
    }
}
