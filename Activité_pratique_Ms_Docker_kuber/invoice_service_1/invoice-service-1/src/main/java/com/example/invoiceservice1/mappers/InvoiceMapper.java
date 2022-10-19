package com.example.invoiceservice1.mappers;

import com.example.invoiceservice1.ControllerRestClient.CustomerRestClient;
import com.example.invoiceservice1.dtos.InvoiceRequestDto;
import com.example.invoiceservice1.dtos.InvoiceResponseDto;
import com.example.invoiceservice1.dtos.InvoiceResponseDtoToCustomerService;
import com.example.invoiceservice1.entities.Customer;
import com.example.invoiceservice1.entities.Invoice;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@AllArgsConstructor
public class InvoiceMapper {
    private CustomerRestClient customerRestClient;
    public InvoiceResponseDto fromInvoice(Invoice invoice){
        InvoiceResponseDto invoiceResponseDto=new InvoiceResponseDto();
        BeanUtils.copyProperties(invoice,invoiceResponseDto);
        if(invoice.getCustomer()!=null)
            invoiceResponseDto.setCustomer(invoice.getCustomer());
        return invoiceResponseDto;
    }
    public Invoice fromInvoiceRequestDto(InvoiceRequestDto invoiceRequestDto){
        Invoice invoice=new Invoice();
        invoice.setId(UUID.randomUUID().toString());
        BeanUtils.copyProperties(invoiceRequestDto,invoice);
        return invoice;
    }

    public InvoiceResponseDtoToCustomerService fromInvoiceServiceInvoice(Invoice invoice){
        InvoiceResponseDtoToCustomerService invoiceResponseDtoToCustomerService=new InvoiceResponseDtoToCustomerService();
        BeanUtils.copyProperties(invoice,invoiceResponseDtoToCustomerService);
        return invoiceResponseDtoToCustomerService;
    }
}
