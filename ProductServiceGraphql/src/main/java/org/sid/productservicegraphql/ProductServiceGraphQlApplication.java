package org.sid.productservicegraphql;

import org.sid.productservicegraphql.Entities.Category;
import org.sid.productservicegraphql.Entities.Product;
import org.sid.productservicegraphql.Repositories.CategoryRepository;
import org.sid.productservicegraphql.Repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ProductServiceGraphQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceGraphQlApplication.class, args);
    }

@Bean
    CommandLineRunner start(ProductRepository productRepository, CategoryRepository categoryRepository){
        return args -> {
            Stream.of("Phones","Computers","Ipads","Tablets").forEach(name->{
                Category category= Category.builder()
                        .name(name)
                        .description("bon"+"\t"+name).
                        build();
                categoryRepository.save(category);
            });

            categoryRepository.findAll().forEach(category -> {
                Stream.of("HP","Iphone","MacBook","Samsung","EliteBook","NoteBook").forEach(proName->{
                    Product product= Product.builder().name(proName)
                            .description("bon"+"\t"+proName)
                            .category(category)
                            .build();
                    productRepository.save(product);
                });

            });
        };
    }
}
