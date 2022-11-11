package com.example.silling_service.Repositories;

import com.example.silling_service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductItemRepository extends JpaRepository<Product,String> {
    List<Product> findBySelling_Id(String id);
    List<Product> findAllBySelling_Id(String id);
}
