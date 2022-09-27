package com.example.inventoryservice.Services;

import com.example.inventoryservice.Entities.Product;
import com.example.inventoryservice.Repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(()->new RuntimeException("Product Not found exception"));
    }

    @Override
    public void deleteProduct(Long id) {
         productRepository.deleteById(id);
    }
}
