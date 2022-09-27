package com.example.inventoryservice.Repositories;

import com.example.inventoryservice.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
