package com.example.silling_service.Repositories;

import com.example.silling_service.entities.Selling;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellingRepository extends JpaRepository<Selling,String> {
    Page<Selling> findByIdContains(String id, Pageable pageable);
}
