package com.example.testing_junit5;

import com.example.testing_junit5.Entities.Product;
import com.example.testing_junit5.Repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class TestingJunit5Application {

    public static void main(String[] args) {
        SpringApplication.run(TestingJunit5Application.class, args);

    }


    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            Stream.of("Hp","Samsung","LG","Legrand","Max").forEach(name->{
                Product product=new Product();
                product.setDescription(name+" good state");
                product.setPrice(Math.random()*10+98854);
                productRepository.save(product);
            });
        };
    }

}
