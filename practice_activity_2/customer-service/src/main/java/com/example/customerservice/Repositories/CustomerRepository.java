package com.example.customerservice.Repositories;

import com.example.customerservice.Entities.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
    Page<Customer> findByIdContains(String id, Pageable pageable);
}
