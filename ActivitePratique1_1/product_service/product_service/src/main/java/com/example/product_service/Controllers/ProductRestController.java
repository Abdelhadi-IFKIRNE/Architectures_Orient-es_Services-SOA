package com.example.product_service.Controllers;


import com.example.product_service.Entities.Product;
import com.example.product_service.Repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductRestController {
    private ProductRepository productRepository;

    @GetMapping("/products/all")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @PostMapping("/products/save")
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
}
