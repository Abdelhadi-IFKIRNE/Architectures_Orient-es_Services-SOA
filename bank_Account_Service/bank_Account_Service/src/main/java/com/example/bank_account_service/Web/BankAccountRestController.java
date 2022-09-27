package com.example.bank_account_service.Web;

import com.example.bank_account_service.Dtos.BankAccountRequestDto;
import com.example.bank_account_service.Dtos.BankAccountResponseDto;
import com.example.bank_account_service.Dtos.BankAccountUpdateDto;
import com.example.bank_account_service.Services.IbankAccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BankAccountRestController {
    private IbankAccountService bankAccountService;

    @GetMapping("/accounts/all")
    public List<BankAccountResponseDto> getAllAccounts(){
        return bankAccountService.getAllBankAccounts();
    }

    @PostMapping("/accounts/save")
    public BankAccountResponseDto saveBankAccount(@RequestBody BankAccountRequestDto bankAccountRequestDto){
        return bankAccountService.saveBankAccount(bankAccountRequestDto);
    }

    @GetMapping("accounts/{id}")
    public BankAccountResponseDto getAccountById(@PathVariable(name = "id") Long id){
        return bankAccountService.getBankAccountById(id);
    }

    @DeleteMapping("/accounts/delete/{id}")
    public void deleteBankAccountById(@PathVariable(name = "id") Long id){
        bankAccountService.deleteBankAccount(id);
    }

    @PutMapping("/accounts/update")
    public BankAccountResponseDto updateBankAccount(@RequestBody BankAccountUpdateDto bankAccountUpdateDto){
        return  bankAccountService.updateBankAccount(bankAccountUpdateDto);
    }
}
