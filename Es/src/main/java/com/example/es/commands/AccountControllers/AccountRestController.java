package com.example.es.commands.AccountControllers;


import com.example.es.commonApi.Dtos.AccountRequestDto;
import com.example.es.commonApi.Dtos.CreditAccountRequestDto;
import com.example.es.commonApi.Dtos.DebitAccountRequestDto;
import com.example.es.commonApi.commands.CreateAccountCommand;
import com.example.es.commonApi.commands.CreditAccountCommand;
import com.example.es.commonApi.commands.DebitAccountCommand;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

@RestController
@AllArgsConstructor
public class AccountRestController {
    private CommandGateway commandGateway;
    private EventStore eventStore;

    @PostMapping("/accounts/new")
    public CompletableFuture<Object>sendEvent(@RequestBody AccountRequestDto accountRequestDto){
         return commandGateway.send(new CreateAccountCommand(
                UUID.randomUUID().toString(),
                accountRequestDto.getBalance(),
                accountRequestDto.getCurrency()
        ));
    }

    @PutMapping("/accounts/credit")
    public CompletableFuture<Object> creditAccount(@RequestBody CreditAccountRequestDto creditAccountRequestDto){
        return commandGateway.send(new CreditAccountCommand(
                creditAccountRequestDto.getId(),
                creditAccountRequestDto.getAmount(),
                creditAccountRequestDto.getCurrency()
        ));
    }

    @PutMapping("/accounts/debit")
    public CompletableFuture<Object> debitedAccount(@RequestBody DebitAccountRequestDto debitAccountRequestDto){
        return commandGateway.send(new DebitAccountCommand(
                debitAccountRequestDto.getId(),
                debitAccountRequestDto.getAmount(),
                debitAccountRequestDto.getCurrency()
        ));
    }


    @GetMapping("/events/{id}")
    public Stream getEvents(@PathVariable(name = "id") String id){
        return eventStore.readEvents(id).asStream();
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> getExecptionMessage(Exception exception){
        ResponseEntity<String> entity=new ResponseEntity<>(
                exception.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
        return entity;
    }
}
