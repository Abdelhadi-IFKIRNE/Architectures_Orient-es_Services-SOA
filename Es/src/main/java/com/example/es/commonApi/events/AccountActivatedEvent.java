package com.example.es.commonApi.events;

import com.example.es.commonApi.Dtos.AccountType;
import lombok.Getter;

public class AccountActivatedEvent extends BaseEvent<String> {
    @Getter private AccountType type;

    public AccountActivatedEvent(String id, AccountType type) {
        super(id);
        this.type = type;
    }
}
