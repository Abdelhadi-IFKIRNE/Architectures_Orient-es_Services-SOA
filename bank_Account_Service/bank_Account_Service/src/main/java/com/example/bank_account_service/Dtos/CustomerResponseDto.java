package com.example.bank_account_service.Dtos;

import lombok.Data;

@Data
public class CustomerResponseDto {
    private Long id;
    private String name;
    private  String email;
}
