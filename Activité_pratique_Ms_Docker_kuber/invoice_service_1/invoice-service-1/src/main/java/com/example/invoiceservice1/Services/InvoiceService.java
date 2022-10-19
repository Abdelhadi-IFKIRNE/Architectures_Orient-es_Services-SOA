package com.example.invoiceservice1.Services;

import com.example.invoiceservice1.dtos.InvoiceRequestDto;
import com.example.invoiceservice1.dtos.InvoiceResponseDto;
import com.example.invoiceservice1.dtos.InvoiceResponseDtoToCustomerService;
import com.example.invoiceservice1.entities.Customer;

import java.util.List;

public interface InvoiceService {
    List<InvoiceResponseDto> getAllInvoices();
    InvoiceResponseDto getInvoiceById(String id);
    InvoiceResponseDto saveInvoice(InvoiceRequestDto invoiceRequestDto);
    List<Customer> getAllCustomers();
    List<InvoiceResponseDtoToCustomerService> getAllInvoicesToSend(String id);
}
