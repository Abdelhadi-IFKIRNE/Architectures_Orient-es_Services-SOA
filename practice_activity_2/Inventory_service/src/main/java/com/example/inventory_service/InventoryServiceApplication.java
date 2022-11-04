package com.example.inventory_service;

import com.example.inventory_service.Dtos.ProductRequestDto;
import com.example.inventory_service.Services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductService productService){
        return args -> {
            Stream.of("Samsung","Hp","Macbook","tablet","elitebook","pro max").forEach(name->{
                ProductRequestDto productRequestDto= ProductRequestDto.builder()
                        .name(name)
                        .description(name+" de bon qualité")
                        .price(Math.random()*5000)
                        .qteStock(8000)
                        .build();
                productService.saveProduct(productRequestDto);
            });
        };
    }

}
