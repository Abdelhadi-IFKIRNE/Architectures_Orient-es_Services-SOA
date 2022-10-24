package com.example.invoiceservice1.Controllers;

import com.example.invoiceservice1.Services.InvoiceService;
import com.example.invoiceservice1.dtos.InvoiceRequestDto;
import com.example.invoiceservice1.dtos.InvoiceResponseDto;
import com.example.invoiceservice1.dtos.InvoiceResponseDtoToCustomerService;
import com.example.invoiceservice1.entities.Customer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api")
@CrossOrigin("*")
public class InvoiceRestController {
    private InvoiceService invoiceService;

    @GetMapping("/invoices/all")
    public List<InvoiceResponseDto> getAllInvoices(){
        return invoiceService.getAllInvoices();
    }

    @GetMapping("/invoices/{id}")
    public InvoiceResponseDto getInvoiceById(@PathVariable(name = "id") String id){
        return invoiceService.getInvoiceById(id);
    }

    @PostMapping("/invoices/add")
    public InvoiceResponseDto saveInvoice(@RequestBody InvoiceRequestDto invoiceRequestDto){
        return this.invoiceService.saveInvoice(invoiceRequestDto);
    }

    @GetMapping("/invoices/customers/all")
    public List<Customer> getAllCustomers(){
        return  this.invoiceService.getAllCustomers();
    }

    @GetMapping("/invoices/customers/find/{id}")
    public List<InvoiceResponseDtoToCustomerService> getInvoicesOfCustomer(@PathVariable(name = "id") String id){
        return invoiceService.getAllInvoicesToSend(id);
    }
}
