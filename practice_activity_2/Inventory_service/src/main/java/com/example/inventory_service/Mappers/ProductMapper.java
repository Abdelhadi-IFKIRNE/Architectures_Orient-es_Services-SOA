package com.example.inventory_service.Mappers;

import com.example.inventory_service.Dtos.ProductRequestDto;
import com.example.inventory_service.Dtos.ProductResponseDto;
import com.example.inventory_service.Entities.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductMapper {

    public Product fromProductRequestDto(ProductRequestDto productRequestDto){
        Product product=new Product();
        product.setId(UUID.randomUUID().toString());
        BeanUtils.copyProperties(productRequestDto,product);
        return product;
    }

    public ProductResponseDto fromProduct(Product product){
        ProductResponseDto productResponseDto=new ProductResponseDto();
        BeanUtils.copyProperties(product,productResponseDto);
        return productResponseDto;
    }
}
