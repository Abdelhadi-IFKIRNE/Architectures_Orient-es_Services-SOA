package com.example.bank_account_service.Dtos;

import com.example.bank_account_service.Enumes.BankAccountType;
import lombok.Data;

@Data
public class BankAccountRequestDto {
    private BankAccountType tp;
    private String currency;
    private double balance;
    private Long idCustomer;
}
