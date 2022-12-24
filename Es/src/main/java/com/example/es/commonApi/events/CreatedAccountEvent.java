package com.example.es.commonApi.events;

import com.example.es.commonApi.Dtos.AccountType;
import lombok.Getter;

public class CreatedAccountEvent extends BaseEvent<String> {
    @Getter private double balance;
    @Getter private String currency;
    @Getter private AccountType type;


    public CreatedAccountEvent(String id, double balance, String currency, AccountType type) {
        super(id);
        this.balance = balance;
        this.currency = currency;
        this.type = type;
    }
}
