package com.example.bank_account_service.Services;

import com.example.bank_account_service.DTOs.BankAccountRequestDTO;
import com.example.bank_account_service.DTOs.BankAccountResponseDTO;

import java.util.List;

public interface IbankAccountServices {
    public BankAccountResponseDTO saveBankAccount(BankAccountRequestDTO bankAccountRequestDTO);
    public BankAccountResponseDTO getBankAccountById(String id);
    public void deleteBankAccount(String id);
    public List<BankAccountResponseDTO> getAllBankAccounts();
}
