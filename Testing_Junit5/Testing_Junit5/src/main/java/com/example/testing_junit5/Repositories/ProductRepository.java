package com.example.testing_junit5.Repositories;

import com.example.testing_junit5.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByDescription(String description);
}
