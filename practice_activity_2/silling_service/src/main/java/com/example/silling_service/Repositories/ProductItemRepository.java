package com.example.silling_service.Repositories;

import com.example.silling_service.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductItemRepository extends JpaRepository<Product,String> {
    @Query("select p from Product p where p.selling.id= ?1")
    Page<Product> getProdsBySellingId(String id,Pageable pageable);
}
