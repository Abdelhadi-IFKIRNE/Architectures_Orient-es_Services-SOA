package com.example.bank_account_service.DTOs;

import com.example.bank_account_service.Enums.BankAccountType;
import lombok.Data;


@Data
public class BankAccountRequestDTO {
    private BankAccountType type;
    private Double balance;
}
