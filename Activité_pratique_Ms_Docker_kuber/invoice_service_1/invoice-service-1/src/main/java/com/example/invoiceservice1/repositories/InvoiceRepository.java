package com.example.invoiceservice1.repositories;

import com.example.invoiceservice1.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice,String> {
    List<Invoice> findByIdCustomer(String id);
}
