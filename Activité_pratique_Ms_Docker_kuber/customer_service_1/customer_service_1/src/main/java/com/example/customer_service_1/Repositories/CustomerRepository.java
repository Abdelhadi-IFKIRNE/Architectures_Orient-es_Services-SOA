package com.example.customer_service_1.Repositories;


import com.example.customer_service_1.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
