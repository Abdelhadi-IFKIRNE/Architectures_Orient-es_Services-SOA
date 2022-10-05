package com.example.testing_junit5.Controllers;


import com.example.testing_junit5.Entities.Product;
import com.example.testing_junit5.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductRestController {
    private ProductService productService;



    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable(name = "id") Long id){
        return productService.getProductById(id);
    }

    @GetMapping("/products/all")
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }
}
