package com.example.bank_account_service.Services;

import com.example.bank_account_service.Dtos.BankAccountRequestDto;
import com.example.bank_account_service.Dtos.BankAccountResponseDto;
import com.example.bank_account_service.Dtos.BankAccountUpdateDto;
import com.example.bank_account_service.Entities.BankAccount;
import com.example.bank_account_service.Entities.Customer;
import com.example.bank_account_service.Mappers.BankAccountMapper;
import com.example.bank_account_service.Repositories.BankAccountRepository;
import com.example.bank_account_service.Repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor
public class bankAccountServiceImpl implements IbankAccountService {
    private BankAccountRepository bankAccountRepository;
    private BankAccountMapper bankAccountMapper;
    private CustomerRepository customerRepository;
    @Override
    public BankAccountResponseDto saveBankAccount(BankAccountRequestDto bankAccountRequestDto) {
        BankAccount bankAccount= BankAccount.builder()
                .balance(bankAccountRequestDto.getBalance())
                .tp(bankAccountRequestDto.getTp())
                .currency(bankAccountRequestDto.getCurrency())
                .createdAt(new Date())
                .customer(customerRepository.findById(bankAccountRequestDto.getIdCustomer()).orElse(null))
                .build();
        return bankAccountMapper.fromBankAccount(bankAccountRepository.save(bankAccount));
    }

    @Override
    public BankAccountResponseDto updateBankAccount(BankAccountUpdateDto bankAccountUpdateDto){
        BankAccount bankAccount=bankAccountRepository.
                findById(bankAccountUpdateDto.getId()).orElseThrow(()->new RuntimeException("BankAccount Not found Exception"));
        Customer customer=customerRepository.
                findById(bankAccountUpdateDto.getIdCustomer()).orElseThrow(()->new RuntimeException("Customer not found exception"));
        bankAccount.setBalance(bankAccountUpdateDto.getBalance());
        bankAccount.setCreatedAt(bankAccountUpdateDto.getCreatedAt());
        bankAccount.setCurrency(bankAccountUpdateDto.getCurrency());
        bankAccount.setTp(bankAccountUpdateDto.getTp());
        bankAccount.setCustomer(customer);
      return bankAccountMapper.fromBankAccount(bankAccountRepository.save(bankAccount));
    }

    @Override
    public BankAccountResponseDto getBankAccountById(Long id) {
        return bankAccountMapper.fromBankAccount(bankAccountRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Account Not Found"))
        );
    }

    @Override
    public List<BankAccountResponseDto> getAllBankAccounts() {
        return bankAccountRepository.findAll().stream().map(bankAccount -> bankAccountMapper.fromBankAccount(bankAccount)).collect(Collectors.toList());
    }

    @Override
    public void deleteBankAccount(@PathVariable(name = "id") Long id){
        bankAccountRepository.deleteById(id);
    }
}
