package com.example.silling_service.Services;

import com.example.silling_service.Dtos.SellingRequestDto;
import com.example.silling_service.Dtos.SellingResponseDto;
import com.example.silling_service.entities.Product;

import java.util.List;

public interface SellingService {
  SellingResponseDto saveSelling(SellingRequestDto sellingRequestDto);
  SellingResponseDto getSellingById(String id);
  List<SellingResponseDto> getAllSelling();
  void DeleteSelling(String id);
  List<Product> getProductsInvoice(String idInvoice);
}
