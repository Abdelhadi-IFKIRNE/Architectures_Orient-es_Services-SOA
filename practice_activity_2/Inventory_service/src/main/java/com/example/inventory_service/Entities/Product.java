package com.example.inventory_service.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private int qteStock;
}
