package com.example.silling_service.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private int qteStock;
    @ManyToOne
    private Selling selling;
}