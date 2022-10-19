package com.example.customer_service_1;


import com.example.customer_service_1.dtos.CustomerRequestDto;
import com.example.customer_service_1.services.ServicesCust;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EnableFeignClients
public class CustomerService1Application {

    public static void main(String[] args) {
        SpringApplication.run(CustomerService1Application.class, args);
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
