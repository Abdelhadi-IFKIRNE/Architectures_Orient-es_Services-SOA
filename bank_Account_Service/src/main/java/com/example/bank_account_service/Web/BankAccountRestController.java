package com.example.bank_account_service.Web;

import com.example.bank_account_service.DTOs.BankAccountRequestDTO;
import com.example.bank_account_service.DTOs.BankAccountResponseDTO;
import com.example.bank_account_service.Services.IbankAccountServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BankAccountRestController {
    private IbankAccountServices accountServices;

    @GetMapping("/accounts")
    public List<BankAccountResponseDTO> getAllBankAccounts() {
        return accountServices.getAllBankAccounts();
    }

    @PostMapping("/bankAccounts/new")
    public BankAccountResponseDTO saveBankAccount(@RequestBody BankAccountRequestDTO bankAccountRequestDTO) {
        return accountServices.saveBankAccount(bankAccountRequestDTO);
    }

    @DeleteMapping("/bankAccounts/delete/{id}")
    public void deleteBankAccount(@PathVariable(name = "id") String id) {
        accountServices.deleteBankAccount(id);
    }
}
