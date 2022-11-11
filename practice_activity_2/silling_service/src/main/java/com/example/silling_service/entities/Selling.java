package com.example.silling_service.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Selling {
    @Id
    private String id;
    private double totalHT;
    private String idCustomer;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    @Transient
    private Customer customer;
    @OneToMany(mappedBy = "selling")
    private List<Product> products=new ArrayList<>();
}
