package com.example.silling_service.Mappers;

import com.example.silling_service.Dtos.ProductResponseDto;
import com.example.silling_service.entities.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ProductMappers {
    public ProductResponseDto fromProduct(Product product){
        ProductResponseDto productResponseDto=new ProductResponseDto();
        BeanUtils.copyProperties(product,productResponseDto);
        return productResponseDto;
    }
}
