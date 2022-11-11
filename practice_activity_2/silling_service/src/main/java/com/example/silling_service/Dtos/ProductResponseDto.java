package com.example.silling_service.Dtos;

import lombok.Data;

@Data
public class ProductResponseDto {
    private String id;
    private String name;
    private String description;
    private double price;
    private int qteCmd;
}
