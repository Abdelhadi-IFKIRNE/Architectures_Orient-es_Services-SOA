package com.example.inventory_service.Services;

import com.example.inventory_service.Dtos.ProductRequestDto;
import com.example.inventory_service.Dtos.ProductResponseDto;

import java.util.List;

public interface ProductService {
    ProductResponseDto saveProduct(ProductRequestDto productRequestDto);
    ProductResponseDto getProductById(String id);
    List<ProductResponseDto> getAllProducts();
    void removeProduct(String id);
}
