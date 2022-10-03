package com.example.product_service;

import com.example.product_service.Entities.Product;
import com.example.product_service.Repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            Stream.of("HP","SAMSUNG","LG","Tablet","Ipad","Iphone").forEach(name->{
                Product product=new Product();
                product.setDescription("a good product : "+name);
                product.setPrice(Math.random()*40+900);
                productRepository.save(product);
            });
        };
    }

}
