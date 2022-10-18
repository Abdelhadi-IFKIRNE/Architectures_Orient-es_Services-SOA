package com.example.invoiceservice1.mappers;

import com.example.invoiceservice1.dtos.InvoiceRequestDto;
import com.example.invoiceservice1.dtos.InvoiceResponseDto;
import com.example.invoiceservice1.entities.Invoice;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    InvoiceMapper INSTANCE= Mappers.getMapper(InvoiceMapper.class);
    InvoiceResponseDto fromInvoice(Invoice invoice);
    Invoice fromInvoiceRequestDto(InvoiceRequestDto invoiceRequestDto);
}
