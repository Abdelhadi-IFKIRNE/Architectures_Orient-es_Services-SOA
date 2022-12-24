package com.example.es.commonApi.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountRequestDto {
    private double balance;
    private String currency;
    private AccountType type;
}
