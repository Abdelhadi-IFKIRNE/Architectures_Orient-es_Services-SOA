package com.example.es.commonApi.mappers;

import com.example.es.commonApi.Dtos.AccountResponseDto;
import com.example.es.queries.entities.Account;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class AccountMapper {
    public AccountResponseDto fromAccount(Account account){
        AccountResponseDto accountResponseDto=new AccountResponseDto();
        BeanUtils.copyProperties(account,accountResponseDto);
        return accountResponseDto;
    }
}
