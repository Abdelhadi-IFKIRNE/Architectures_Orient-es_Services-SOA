package com.example.bank_account_service.DTOs;

import com.example.bank_account_service.Enums.BankAccountType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class BankAccountResponseDTO {
    private String id;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date createdAt;
    private BankAccountType type;
    private Double balance;
}
