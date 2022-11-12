package com.example.silling_service.Dtos;

import lombok.Data;

import java.util.List;

@Data
public class PageSellingResponseDto {
    private int nbrPages;
    private List<SellingResponseDto> sellingResponseDtos;
}
