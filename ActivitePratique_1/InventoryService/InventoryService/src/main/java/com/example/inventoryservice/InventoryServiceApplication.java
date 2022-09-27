package com.example.inventoryservice;

import com.example.inventoryservice.Entities.Product;
import com.example.inventoryservice.Services.ProductService;
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
             Stream.of("Hp","Samsung","TV","LG","Iphone").forEach(name->{
                 Product product=new Product();
                 product.setDescription(name+"\t"+"de bonne qualité");
                 product.setName(name);
                 productService.saveProduct(product);
             });
         };
    }

}
