package com.example.bank_account_service;

import com.example.bank_account_service.Entities.BankAccount;
import com.example.bank_account_service.Enums.BankAccountType;
import com.example.bank_account_service.Repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class BankAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BankAccountRepository bankAccountRepository) {
        return args -> {
            for (int i = 0; i < 10; i++) {
                BankAccount bankAccount = BankAccount.builder().balance(8000D)
                        .type(Math.random() > 0.5 ? BankAccountType.CURRENT_ACCOUNT : BankAccountType.SAVING_ACCOUNT)
                        .id(UUID.randomUUID().toString())
                        .createdAt(new Date())
                        .build();
                bankAccountRepository.save(bankAccount);
            }

        };
    }
}
