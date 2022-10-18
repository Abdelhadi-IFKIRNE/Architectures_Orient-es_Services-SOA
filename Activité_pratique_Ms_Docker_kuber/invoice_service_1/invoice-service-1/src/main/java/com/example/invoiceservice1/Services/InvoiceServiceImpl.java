package com.example.invoiceservice1.Services;

import com.example.invoiceservice1.dtos.InvoiceRequestDto;
import com.example.invoiceservice1.dtos.InvoiceResponseDto;
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
    @Override
    public List<InvoiceResponseDto> getAllInvoices() {
        return invoiceRepository.findAll().stream().map(invoice->invoiceMapper.fromInvoice(invoice)).collect(Collectors.toList());
    }

    @Override
    public InvoiceResponseDto getInvoiceById(Long id) {
        return invoiceMapper.fromInvoice(invoiceRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Invoice not found")));
    }

    @Override
    public InvoiceResponseDto saveInvoice(InvoiceRequestDto invoiceRequestDto) {
        return invoiceMapper.fromInvoice(invoiceRepository.save(invoiceMapper.fromInvoiceRequestDto(invoiceRequestDto)));
    }
}
