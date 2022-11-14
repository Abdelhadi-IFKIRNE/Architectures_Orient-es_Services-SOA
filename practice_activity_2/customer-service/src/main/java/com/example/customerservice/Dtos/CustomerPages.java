package com.example.customerservice.Dtos;

import lombok.Data;

import java.util.List;

@Data
public class CustomerPages {
    private int nbrPages;
    private List<CustomerResponseDto> customers;
}
