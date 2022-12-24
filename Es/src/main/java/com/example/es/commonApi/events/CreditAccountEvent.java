package com.example.es.commonApi.events;

import lombok.Getter;

public class CreditAccountEvent extends BaseEvent<String>{
    @Getter private double amount;
    @Getter private String currency;
    public CreditAccountEvent(String id, double amount, String currency) {
        super(id);
        this.amount = amount;
        this.currency = currency;
    }
}
