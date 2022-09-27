package com.example.cutomerservice.Repositories;

import com.example.cutomerservice.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
