package com.example.invoiceservice1;

import com.example.invoiceservice1.Services.InvoiceService;
import com.example.invoiceservice1.dtos.InvoiceRequestDto;
import com.example.invoiceservice1.entities.Invoice;
import com.example.invoiceservice1.enums.Inv_Enum;
import com.example.invoiceservice1.repositories.InvoiceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EnableFeignClients
public class InvoiceService1Application {

    public static void main(String[] args) {
        SpringApplication.run(InvoiceService1Application.class, args);
    }

    @Bean
    CommandLineRunner start(InvoiceService invoiceService){
        return args -> {
            invoiceService.getAllCustomers().forEach(customer -> {
                Stream.of("Invoice1","invoice2","invoice3","invoice4").forEach(billing->{
                    InvoiceRequestDto invoiceRequestDto=new InvoiceRequestDto();
                    invoiceRequestDto.setDescription("Description of"+billing);
                    invoiceRequestDto.setIdCustomer(customer.getId());
                    invoiceRequestDto.setStatus(Math.random()>0.5?"Valid":"Wait");
                    invoiceService.saveInvoice(invoiceRequestDto);
            });
            });
        };
    }

}
