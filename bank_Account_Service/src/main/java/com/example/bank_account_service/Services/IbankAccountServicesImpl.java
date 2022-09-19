package com.example.bank_account_service.Services;

import com.example.bank_account_service.DTOs.BankAccountRequestDTO;
import com.example.bank_account_service.DTOs.BankAccountResponseDTO;
import com.example.bank_account_service.Mappers.BankAccountMappers;
import com.example.bank_account_service.Repositories.BankAccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
@Transactional
public class IbankAccountServicesImpl implements IbankAccountServices {
    private BankAccountRepository bankAccountRepository;
    private BankAccountMappers bankAccountMappers;
    @Override
    public BankAccountResponseDTO saveBankAccount(BankAccountRequestDTO bankAccountRequestDTO) {
        return bankAccountMappers.fromBankAccount( bankAccountRepository.save(bankAccountMappers.fromBankAccountRequestDtoToBankAccount(bankAccountRequestDTO)));
    }

    @Override
    public BankAccountResponseDTO getBankAccountById(String id) {
        return bankAccountMappers.fromBankAccount(bankAccountRepository.findById(id).orElse(null));
    }

    @Override
    public void deleteBankAccount(String id) {
        bankAccountRepository.deleteById(id);
    }

    @Override
    public List<BankAccountResponseDTO> getAllBankAccounts() {
        return bankAccountRepository.findAll().stream().map(bankAccount -> bankAccountMappers.fromBankAccount(bankAccount)).collect(Collectors.toList());
    }
}
