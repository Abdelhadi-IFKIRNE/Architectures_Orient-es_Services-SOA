package com.example.bank_account_service.Entities;

import com.example.bank_account_service.Enums.BankAccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor @Builder
public class BankAccount {
    @Id
    private String id;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date createdAt;
    @Enumerated(EnumType.STRING)
    private BankAccountType type;
    private Double balance;
}
