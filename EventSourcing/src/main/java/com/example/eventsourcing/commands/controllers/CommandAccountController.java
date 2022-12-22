package com.example.eventsourcing.commands.controllers;


import com.example.eventsourcing.commonapi.commands.CreateAccountCommand;
import com.example.eventsourcing.commonapi.dtos.CreateAccountRequestDto;
import lombok.AllArgsConstructor;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@AllArgsConstructor
public class CommandAccountController {
    private CommandGateway commandGateway;
    @PostMapping(path = "/accounts/new ")
    public CompletableFuture<Object> createAccount(@RequestBody CreateAccountRequestDto accountRequestDto){
        CompletableFuture<Object> response = commandGateway.send(new CreateAccountCommand(UUID.randomUUID().toString(),
                accountRequestDto.getBalance(),
                accountRequestDto.getCurrency()
        ));
        return response;
    }
}
