package com.example.invoiceservice1;

import com.example.invoiceservice1.Services.InvoiceService;
import com.example.invoiceservice1.dtos.InvoiceRequestDto;
import com.example.invoiceservice1.enums.Inv_Enum;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class InvoiceService1Application {

    public static void main(String[] args) {
        SpringApplication.run(InvoiceService1Application.class, args);
    }

    @Bean
    CommandLineRunner start(InvoiceService invoiceService){
        return args -> {
            Stream.of("Invoice1","invoice2","invoice3","invoice4").forEach(billing->{
                InvoiceRequestDto invoiceRequestDto=new InvoiceRequestDto();
                invoiceRequestDto.setDescription("Description of"+billing);
                invoiceRequestDto.setStatus(Math.random()>0.5? Inv_Enum.Valid:Inv_Enum.Wait);
                invoiceService.saveInvoice(invoiceRequestDto);
            });
        };
    }

}
