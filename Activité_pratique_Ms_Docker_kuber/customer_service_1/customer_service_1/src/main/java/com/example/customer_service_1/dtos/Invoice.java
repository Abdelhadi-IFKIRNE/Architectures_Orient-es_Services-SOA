package com.example.customer_service_1.dtos;

import lombok.Data;

@Data
public class Invoice {
    private String id;
    private String description;
    private String status;
}
