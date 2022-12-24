package com.example.es.commands.agregates;

import com.example.es.commonApi.Dtos.AccountType;
import com.example.es.commonApi.commands.CreateAccountCommand;
import com.example.es.commonApi.commands.CreditAccountCommand;
import com.example.es.commonApi.commands.DebitAccountCommand;
import com.example.es.commonApi.events.AccountActivatedEvent;
import com.example.es.commonApi.events.CreatedAccountEvent;
import com.example.es.commonApi.events.CreditAccountEvent;
import com.example.es.commonApi.events.DebitedAccountEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class AgregateAccount {
    @AggregateIdentifier
    private String idAccount;
    private double balance;
    private String currency;
    private AccountType type;

    public AgregateAccount() {
    }

    @CommandHandler
    public AgregateAccount(CreateAccountCommand createAccountCommand){
        AggregateLifecycle.apply(new CreatedAccountEvent(
                createAccountCommand.getId(),
                createAccountCommand.getBalance(),
                createAccountCommand.getCurrency(),
                createAccountCommand.getType()

        ));
    }

    @EventSourcingHandler
    public void On(CreatedAccountEvent createdAccountEvent){
        this.idAccount= createdAccountEvent.getId();
        this.balance= createdAccountEvent.getBalance();
        this.currency= createdAccountEvent.getCurrency();
        this.type=AccountType.ACTIVATED;
        AggregateLifecycle.apply(new AccountActivatedEvent(
                createdAccountEvent.getId(),
                AccountType.ACTIVATED
        ));
    }

    @CommandHandler
    public void handel(CreditAccountCommand creditAccountCommand){
        if(creditAccountCommand.getAmount()<0)throw new RuntimeException("le montant est negatif.....");
        AggregateLifecycle.apply(new CreditAccountEvent(
                creditAccountCommand.getId(),
                creditAccountCommand.getAmount(),
                creditAccountCommand.getCurrency()
        ));
    }

    @EventSourcingHandler
    public void OnCreditedAccount(CreditAccountEvent creditAccountEvent){
        this.balance+= creditAccountEvent.getAmount();
    }

    @CommandHandler
    public void handelDebitAccountCommand(DebitAccountCommand debitAccountCommand){
        if(debitAccountCommand.getAmount()<0)throw new RuntimeException("le montant est negatif");
        AggregateLifecycle.apply(new DebitedAccountEvent(
                debitAccountCommand.getId(),
                debitAccountCommand.getAmount(),
                debitAccountCommand.getCurrency()
        ));
    }

    @EventSourcingHandler
    public void OnDebitedEvent(DebitedAccountEvent debitedAccountEvent){
          this.balance-= debitedAccountEvent.getAmount();
    }

    @EventSourcingHandler
    public void On(AccountActivatedEvent accountActivatedEvent){
        this.type=accountActivatedEvent.getType();
    }
}
