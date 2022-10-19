package com.example.customer_service_1.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CustomerResponseDto {
    private String id;
    private String name;
    private String email;
}
