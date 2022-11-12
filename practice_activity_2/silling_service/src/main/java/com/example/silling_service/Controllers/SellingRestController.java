package com.example.silling_service.Controllers;

import com.example.silling_service.Dtos.*;
import com.example.silling_service.Mappers.ProductMappers;
import com.example.silling_service.Repositories.ProductItemRepository;
import com.example.silling_service.Services.SellingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class SellingRestController {
    private SellingService sellingService;
    @PostMapping("/selling/add")
    public SellingResponseDto saveSelling(@RequestBody SellingRequestDto sellingRequestDto){
        return sellingService.saveSelling(sellingRequestDto);
    }
    @GetMapping("/selling/all")
    public List<SellingResponseDto> getAllSellings(){
        return sellingService.getAllSelling();
    }
    @GetMapping("/selling/products/{idInvoice}")
    public List<ProductResponseDto> getInvoiceProducts(@PathVariable String idInvoice){
        return sellingService.getProductsInvoice(idInvoice);
    }

    @GetMapping("/selling/pages")
    public PageSellingResponseDto getTotalSellingPages(@RequestParam(name = "id",defaultValue = "") String id,
                                                       @RequestParam(name = "page",defaultValue = "0") int page,
                                                       @RequestParam(name = "size",defaultValue = "5") int size){
        return sellingService.getSellingPages(id, page, size);
    }

    @GetMapping("/selling/detail")
    public DetailOrder getDetailOrder(@RequestParam(name = "id",defaultValue = "") String id,
                                            @RequestParam(name = "page",defaultValue = "0") int page,
                                            @RequestParam(name = "size",defaultValue = "5") int size){
        return sellingService.getDetailPages(id, page, size);
    }

}
