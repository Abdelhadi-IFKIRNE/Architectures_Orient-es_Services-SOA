package com.example.silling_service.Dtos;

import com.example.silling_service.entities.Customer;
import com.example.silling_service.entities.Product;
import lombok.Data;

import java.util.List;
@Data
public class DetailOrder {
    private Customer customer;
    private int nbPages;
    private List<ProductResponseDto> productResponseDtos;
}
