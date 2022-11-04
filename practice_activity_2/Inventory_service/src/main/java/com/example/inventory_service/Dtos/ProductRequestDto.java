package com.example.inventory_service.Dtos;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class ProductRequestDto {
    private String name;
    private String description;
    private double price;
    private int qteStock;
}
