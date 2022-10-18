package com.example.invoiceservice1.Services;

import com.example.invoiceservice1.dtos.InvoiceRequestDto;
import com.example.invoiceservice1.dtos.InvoiceResponseDto;

import java.util.List;

public interface InvoiceService {
    List<InvoiceResponseDto> getAllInvoices();
    InvoiceResponseDto getInvoiceById(Long id);
    InvoiceResponseDto saveInvoice(InvoiceRequestDto invoiceRequestDto);
}
