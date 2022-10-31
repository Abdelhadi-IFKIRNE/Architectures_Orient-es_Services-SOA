package com.example.customerservice;

import com.example.customerservice.Dtos.CustomerDtoRequest;
import com.example.customerservice.Services.serviceCustomer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(serviceCustomer serviceCustomer){
        return args -> {
            Stream.of("belkacem","abdelhadi","abderrahim","moustapha","imarane","zakaria").forEach(name->{
                CustomerDtoRequest customerDtoRequest=new CustomerDtoRequest();
                customerDtoRequest.setName(name);
                customerDtoRequest.setEmail(name+"@gmail.com");
                serviceCustomer.addCustomer(customerDtoRequest);
            });
        };
    }

}
