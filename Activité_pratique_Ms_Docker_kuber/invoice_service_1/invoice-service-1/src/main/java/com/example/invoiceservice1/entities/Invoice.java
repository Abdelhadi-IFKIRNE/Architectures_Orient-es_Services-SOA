package com.example.invoiceservice1.entities;

import com.example.invoiceservice1.enums.Inv_Enum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Invoice {
    @Id
    private String id;
    private String description;
    private String status;
    private String idCustomer;
    @Transient
    private Customer customer;
}
