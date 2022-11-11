package com.example.silling_service.Controllers;

import com.example.silling_service.Dtos.ProductResponseDto;
import com.example.silling_service.Dtos.SellingRequestDto;
import com.example.silling_service.Dtos.SellingResponseDto;
import com.example.silling_service.Mappers.ProductMappers;
import com.example.silling_service.Repositories.ProductItemRepository;
import com.example.silling_service.Services.SellingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor

public class SellingRestController {
    private SellingService sellingService;


    @PostMapping("/sellings/add")
    public SellingResponseDto saveSelling(@RequestBody SellingRequestDto sellingRequestDto){
        return sellingService.saveSelling(sellingRequestDto);
    }

    @GetMapping("/sellings/all")
    public List<SellingResponseDto> getAllSellings(){
        return sellingService.getAllSelling();
    }
    @GetMapping("/sellings/products/{idInvoice}")
    public List<ProductResponseDto> getInvoiceProducts(@PathVariable String idInvoice){
        return sellingService.getProductsInvoice(idInvoice);
    }


}
