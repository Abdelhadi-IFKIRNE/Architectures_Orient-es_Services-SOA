package com.example.bank_account_service;

import com.example.bank_account_service.Entities.BankAccount;
import com.example.bank_account_service.Entities.Customer;
import com.example.bank_account_service.Enumes.BankAccountType;
import com.example.bank_account_service.Repositories.BankAccountRepository;
import com.example.bank_account_service.Repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class BankAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository, BankAccountRepository bankAccountRepository) {
        return args -> {
            Stream.of("Abdelhadi", "Moustapha", "Abderrahim", "Zakaria", "Aimrane").forEach(name -> {
                Customer customer = Customer.builder()
                        .name(name)
                        .email(name + "@gmail.com")
                        .build();
                customerRepository.save(customer);
            });

            customerRepository.findAll().forEach(c->{
                for (int i = 0; i < 20; i++) {
                    BankAccount bankAccount= BankAccount.builder()
                            .balance(Math.random()<0.5?8000+20*Math.random():10000+Math.random()+5000)
                            .tp(Math.random()<0.5? BankAccountType.Saving:BankAccountType.Current)
                            .currency(Math.random()<0.5? "MAD":"EUR")
                            .customer(c)
                            .build();
                    bankAccountRepository.save(bankAccount);
                }
            });
        };
        };

    }

