package com.example.bank_account_service.Dtos;

import com.example.bank_account_service.Enumes.BankAccountType;
import lombok.Data;

import java.util.Date;

@Data
public class BankAccountResponseDto {
    private Long id;
    private Date createdAt;
    private BankAccountType tp;
    private String currency;
    private double balance;
    private CustomerResponseDto customerResponseDto;
}
