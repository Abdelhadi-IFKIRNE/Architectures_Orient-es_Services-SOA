package com.example.invoiceservice1.dtos;

import com.example.invoiceservice1.enums.Inv_Enum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceRequestDto {
    private Long id;
    private String description;
    private String status;
    private Long idCustomer;
}
