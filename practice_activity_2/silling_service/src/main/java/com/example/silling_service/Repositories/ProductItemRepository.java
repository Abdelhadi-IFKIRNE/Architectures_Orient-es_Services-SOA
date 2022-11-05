package com.example.silling_service.Repositories;

import com.example.silling_service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<Product,String> {
}
