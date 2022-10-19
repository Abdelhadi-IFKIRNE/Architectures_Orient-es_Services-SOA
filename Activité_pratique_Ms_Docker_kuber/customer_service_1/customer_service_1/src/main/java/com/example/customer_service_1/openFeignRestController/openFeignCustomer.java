package com.example.customer_service_1.openFeignRestController;


import com.example.customer_service_1.dtos.Invoice;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "INVOICE-SERVICE")
public interface openFeignCustomer {
    @GetMapping("/api/invoices/customers/find/{id}")
    List<Invoice> getAllInvoicesCustomer(@PathVariable(name = "id") String id);
}
