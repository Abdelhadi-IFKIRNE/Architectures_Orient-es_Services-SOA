package com.example.invoiceservice1.Services;

import com.example.invoiceservice1.ControllerRestClient.CustomerRestClient;
import com.example.invoiceservice1.dtos.InvoiceRequestDto;
import com.example.invoiceservice1.dtos.InvoiceResponseDto;
import com.example.invoiceservice1.dtos.InvoiceResponseDtoToCustomerService;
import com.example.invoiceservice1.entities.Customer;
import com.example.invoiceservice1.entities.Invoice;
import com.example.invoiceservice1.mappers.InvoiceMapper;
import com.example.invoiceservice1.repositories.InvoiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class InvoiceServiceImpl implements InvoiceService {
    private InvoiceMapper invoiceMapper;
    private InvoiceRepository invoiceRepository;

    private CustomerRestClient customerRestClient;
    @Override
    public List<InvoiceResponseDto> getAllInvoices() {
       return invoiceRepository.findAll().stream().map(invoice -> {
                    InvoiceResponseDto invoiceResponseDto=invoiceMapper.fromInvoice(invoice);
                    invoiceResponseDto.setCustomer(customerRestClient.getCustomerById(invoice.getIdCustomer()));
                    return invoiceResponseDto;
                }
        ).collect(Collectors.toList());
    }

    @Override
    public InvoiceResponseDto getInvoiceById(String id) {
        Invoice invoice=invoiceRepository.findById(id).orElseThrow(()->new RuntimeException("Invoice not found exception"));
        Customer customer=customerRestClient.getCustomerById(invoice.getIdCustomer());
        invoice.setCustomer(customer);
        return invoiceMapper.fromInvoice(invoice);
    }

    @Override
    public InvoiceResponseDto saveInvoice(InvoiceRequestDto invoiceRequestDto) {
        return invoiceMapper.fromInvoice(invoiceRepository.save(invoiceMapper.fromInvoiceRequestDto(invoiceRequestDto)));
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRestClient.allCustomers();
    }

    @Override
    public List<InvoiceResponseDtoToCustomerService> getAllInvoicesToSend(String id) {
        return invoiceRepository.findByIdCustomer(id).stream().map(invoice ->
                invoiceMapper.fromInvoiceServiceInvoice(invoice)).collect(Collectors.toList());
    }
}
