package com.example.customer_service;

import com.example.customer_service.dtos.CustomerRequestDto;
import com.example.customer_service.services.ServicesCust;
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
  CommandLineRunner start(ServicesCust servicesCust){
        return args -> {
            Stream.of("Abdelhadi","Abderrahim","Moustapha","Belkacem","Imrane","Zakria").
            forEach(name->{
                CustomerRequestDto customerRequestDto=new CustomerRequestDto();
                customerRequestDto.setName(name);
                customerRequestDto.setEmail(name+"@gmail.com");
                servicesCust.addCustomer(customerRequestDto);
            });
        };
  }

}
