package com.example.invoiceservice1.dtos;

import lombok.Data;

@Data
public class InvoiceResponseDtoToCustomerService {
    private String id;
    private String description;
    private String status;
}
