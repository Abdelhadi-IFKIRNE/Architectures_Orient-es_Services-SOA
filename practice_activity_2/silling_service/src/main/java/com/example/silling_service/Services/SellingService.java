package com.example.silling_service.Services;

import com.example.silling_service.Dtos.*;
import com.example.silling_service.entities.Product;

import java.util.List;

public interface SellingService {
  SellingResponseDto saveSelling(SellingRequestDto sellingRequestDto);
  SellingResponseDto getSellingById(String id);
  List<SellingResponseDto> getAllSelling();
  void DeleteSelling(String id);
  List<ProductResponseDto> getProductsInvoice(String idInvoice);
  PageSellingResponseDto getSellingPages(String id, int page, int size);
  DetailOrder getDetailPages(String id, int page, int size);
}
