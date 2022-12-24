package com.example.es.queries.service;

import com.example.es.commonApi.Dtos.AccountResponseDto;
import com.example.es.commonApi.events.AccountActivatedEvent;
import com.example.es.commonApi.events.CreatedAccountEvent;
import com.example.es.commonApi.mappers.AccountMapper;
import com.example.es.commonApi.queries.GetAllAccounts;
import com.example.es.queries.Repositories.AccountRepository;
import com.example.es.queries.Repositories.OperationRepository;
import com.example.es.queries.entities.Account;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
@Transactional
public class AccountService {
    private AccountRepository accountRepository;
    private OperationRepository operationRepository;
    private AccountMapper accountMapper;
    @EventHandler
    public void onCreateAccountEvent(CreatedAccountEvent createdAccountEvent){
        Account account=new Account();
        account.setId(createdAccountEvent.getId());
        account.setBalance(createdAccountEvent.getBalance());
        account.setCurrency(createdAccountEvent.getCurrency());
        account.setType(createdAccountEvent.getType());
        accountRepository.save(account);
    }

    @EventHandler
    public void onActivateAccount(AccountActivatedEvent accountActivatedEvent){
        Account account=accountRepository.findById(accountActivatedEvent.getId()).orElse(null);
        account.setType(accountActivatedEvent.getType());
        accountRepository.save(account);
    }

    @QueryHandler
    public List<AccountResponseDto> OnGetAccounts(GetAllAccounts query){
        return accountRepository.findAll().stream().map(account ->accountMapper.fromAccount(account)).collect(Collectors.toList());
    }
}
