package com.example.silling_service.Dtos;

import com.example.silling_service.entities.Customer;
import lombok.Data;

import java.util.Date;

@Data
public class SellingResponseDto {
    private String id;
    private double totalHT;
    private Date date;
    private Customer customer;
}
