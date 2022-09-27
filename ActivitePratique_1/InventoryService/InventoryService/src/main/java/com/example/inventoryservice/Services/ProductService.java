package com.example.inventoryservice.Services;

import com.example.inventoryservice.Entities.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();
    public Product saveProduct(Product product);
    public Product getProductById(Long id);
    public void deleteProduct(Long id);
}
