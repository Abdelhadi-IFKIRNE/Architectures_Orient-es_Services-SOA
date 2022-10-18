package com.example.invoiceservice1.Controllers;

import com.example.invoiceservice1.Services.InvoiceService;
import com.example.invoiceservice1.dtos.InvoiceRequestDto;
import com.example.invoiceservice1.dtos.InvoiceResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class InvoiceRestController {
    private InvoiceService invoiceService;

    @GetMapping("/invoices/all")
    public List<InvoiceResponseDto> getAllInvoices(){
        return invoiceService.getAllInvoices();
    }

    @GetMapping("/invoices/{id}")
    public InvoiceResponseDto getInvoiceById(@PathVariable(name = "id") Long id){
        return invoiceService.getInvoiceById(id);
    }

    @PostMapping("/invoices/add")
    public InvoiceResponseDto saveInvoice(InvoiceRequestDto invoiceRequestDto){
        return this.invoiceService.saveInvoice(invoiceRequestDto);
    }
}
