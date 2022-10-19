package com.example.invoiceservice1.dtos;

import com.example.invoiceservice1.entities.Customer;
import com.example.invoiceservice1.enums.Inv_Enum;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
public class InvoiceResponseDto {
    private Long id;
    private String description;
    private String status;
    private Customer customer;
}
