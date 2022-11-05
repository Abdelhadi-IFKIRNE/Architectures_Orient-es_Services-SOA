package com.example.silling_service.Dtos;

import com.example.silling_service.Types.ProdWithQte;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SellingRequestDto {
    private String idCustomer;
    private List<ProdWithQte> prodWithQtes;
}
