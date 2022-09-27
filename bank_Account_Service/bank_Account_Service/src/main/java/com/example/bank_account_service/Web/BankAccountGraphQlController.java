package com.example.bank_account_service.Web;

import com.example.bank_account_service.Dtos.BankAccountRequestDto;
import com.example.bank_account_service.Dtos.BankAccountResponseDto;
import com.example.bank_account_service.Dtos.BankAccountUpdateDto;
import com.example.bank_account_service.Services.IbankAccountService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class BankAccountGraphQlController {
    private IbankAccountService bankAccountService;

    @QueryMapping
    public List<BankAccountResponseDto> getAllAccounts(){
        return bankAccountService.getAllBankAccounts();
    }

    @MutationMapping
    public BankAccountResponseDto saveBankAccount(@Argument BankAccountRequestDto bankAccountRequestDto){
        return bankAccountService.saveBankAccount(bankAccountRequestDto);
    }

   @QueryMapping
    public BankAccountResponseDto getAccountById(@Argument Long id){
        return bankAccountService.getBankAccountById(id);
    }

   @MutationMapping
    public void deleteBankAccountById(@Argument Long id){
        bankAccountService.deleteBankAccount(id);
    }

   @MutationMapping
    public BankAccountResponseDto updateBankAccount(@Argument BankAccountUpdateDto bankAccountUpdateDto){
        return  bankAccountService.updateBankAccount(bankAccountUpdateDto);
    }
}
