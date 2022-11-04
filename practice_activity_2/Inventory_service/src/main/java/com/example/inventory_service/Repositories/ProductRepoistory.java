package com.example.inventory_service.Repositories;

import com.example.inventory_service.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepoistory extends JpaRepository<Product,String> {
}
