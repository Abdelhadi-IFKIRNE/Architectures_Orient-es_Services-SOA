package com.example.silling_service.OpenFeignServices;

import com.example.silling_service.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventory-service")
public interface ProductOpenFeignClient {
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable(name = "id") String id);
}
