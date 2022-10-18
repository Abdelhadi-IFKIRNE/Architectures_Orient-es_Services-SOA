package com.example.invoiceservice1.repositories;

import com.example.invoiceservice1.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice,Long> {
}
