package com.example.invoiceservice1.dtos;

import com.example.invoiceservice1.enums.Inv_Enum;
import lombok.Data;

@Data
public class InvoiceResponseDto {
    private Long id;
    private String description;
    private Inv_Enum status;
}
