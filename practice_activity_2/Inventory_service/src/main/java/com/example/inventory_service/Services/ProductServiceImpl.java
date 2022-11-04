package com.example.inventory_service.Services;

import com.example.inventory_service.Dtos.ProductRequestDto;
import com.example.inventory_service.Dtos.ProductResponseDto;
import com.example.inventory_service.Mappers.ProductMapper;
import com.example.inventory_service.Repositories.ProductRepoistory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepoistory productRepoistory;
    private ProductMapper productMapper;
    @Override
    public ProductResponseDto saveProduct(ProductRequestDto productRequestDto) {
        return productMapper.fromProduct(productRepoistory.save(productMapper.fromProductRequestDto(productRequestDto)));
    }

    @Override
    public ProductResponseDto getProductById(String id) {
        return productMapper.fromProduct(productRepoistory.findById(id).orElseThrow(()->
            new RuntimeException("Product Not found exception ...!")
        ));
    }

    @Override
    public List<ProductResponseDto> getAllProducts() {
        return productRepoistory.findAll().stream().map(product -> productMapper.fromProduct(product)).collect(Collectors.toList());
    }

    @Override
    public void removeProduct(String id) {
          productRepoistory.deleteById(id);
    }
}
