package com.example.es.commonApi.Dtos;

import lombok.Data;

@Data
public class CreditAccountRequestDto {
    private String id;
    private double amount;
    private String currency;
}
