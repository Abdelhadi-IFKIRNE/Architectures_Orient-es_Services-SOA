package com.example.es.commonApi.Dtos;

import lombok.Data;

@Data
public class DebitAccountRequestDto {
    private String id;
    private double amount;
    private String currency;
}
