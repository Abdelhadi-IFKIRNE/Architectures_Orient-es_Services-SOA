package com.example.es.commonApi.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponseDto {
    private String id;
    private double balance;
    private String currency;
    private AccountType type;
}
