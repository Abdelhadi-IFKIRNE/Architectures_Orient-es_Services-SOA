package com.example.eventsourcing.commonapi.commands;


public class CreateAccountCommand extends BaseCommand<String>{
    private double balance;
    private String currency;

    public CreateAccountCommand(String id,double balance,String currency) {
        super(id);
        this.balance=balance;
        this.currency=currency;
    }
}
