package com.example.es.commonApi.commands;

import com.example.es.commonApi.Dtos.AccountType;
import lombok.Getter;

public class CreateAccountCommand extends BaseCommand<String>{
    @Getter private double balance;
    @Getter private String currency;
    @Getter private AccountType type;
    public CreateAccountCommand(String id, double balance, String currency) {
        super(id);
        this.balance = balance;
        this.currency = currency;
    }
}
