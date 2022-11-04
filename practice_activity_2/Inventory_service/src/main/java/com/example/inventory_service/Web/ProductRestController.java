package com.example.inventory_service.Web;


import com.example.inventory_service.Dtos.ProductRequestDto;
import com.example.inventory_service.Dtos.ProductResponseDto;
import com.example.inventory_service.Services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class ProductRestController {
    private ProductService productService;

    @GetMapping("/products/all")
    public List<ProductResponseDto> getAllProducts(){
        return productService.getAllProducts();
    }
     @PostMapping("/products/add")
    public ProductResponseDto saveProduct(@RequestBody ProductRequestDto productRequestDto){
        return productService.saveProduct(productRequestDto);
    }
    @GetMapping("/products/{id}")
    public ProductResponseDto getProductById(@PathVariable(name = "id") String id){
        return productService.getProductById(id);
    }
    @DeleteMapping("/products/delete/{id}")
    public void deleteProduct(@PathVariable(name = "id") String id){
        productService.removeProduct(id);
    }
}
