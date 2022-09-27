package com.example.inventoryservice.Web;


import com.example.inventoryservice.Entities.Product;
import com.example.inventoryservice.Services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductRestController {
    private ProductService productService;
    @GetMapping("/products/all")
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }
}
