package com.example.es.queries.Controllers;


import com.example.es.commonApi.Dtos.AccountResponseDto;
import com.example.es.commonApi.queries.GetAllAccounts;
import lombok.AllArgsConstructor;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
public class RestController {
    private QueryGateway queryGateway;

    @GetMapping("/accounts/all")
    public List<AccountResponseDto> allAccounts(){
        return queryGateway.query(new GetAllAccounts(), ResponseTypes.multipleInstancesOf(AccountResponseDto.class)).join();
    }
}
