package com.example.cutomerservice;

import com.example.cutomerservice.Entities.Customer;
import com.example.cutomerservice.Services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.smartcardio.CommandAPDU;
import java.util.stream.Stream;

@SpringBootApplication
public class CutomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CutomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerService customerService){
        return args -> {
            Stream.of("Abdelhadi","Moustapha","Abderrahim","Belkacem","Zakaria","Imrane")
                    .forEach(name->{
                        Customer customer=new Customer();
                        customer.setName(name);
                        customer.setEmail(name+"@gmail.com");
                        customerService.saveCustomer(customer);
                    });
        };
    }

}
