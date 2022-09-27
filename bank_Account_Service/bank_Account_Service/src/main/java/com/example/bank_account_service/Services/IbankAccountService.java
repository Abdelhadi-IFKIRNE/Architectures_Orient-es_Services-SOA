package com.example.bank_account_service.Services;

import com.example.bank_account_service.Dtos.BankAccountRequestDto;
import com.example.bank_account_service.Dtos.BankAccountResponseDto;
import com.example.bank_account_service.Dtos.BankAccountUpdateDto;


import java.util.List;

public interface IbankAccountService {
  BankAccountResponseDto saveBankAccount(BankAccountRequestDto bankAccountRequestDto);

  BankAccountResponseDto updateBankAccount(BankAccountUpdateDto bankAccountUpdateDto);

  BankAccountResponseDto getBankAccountById(Long id);
  List<BankAccountResponseDto> getAllBankAccounts();

  void deleteBankAccount(Long id);
}
