package com.example.testing_junit5.services;

import com.example.testing_junit5.Entities.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getAllProduct();
}
