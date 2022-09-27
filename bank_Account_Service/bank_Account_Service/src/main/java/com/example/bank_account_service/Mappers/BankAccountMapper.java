package com.example.bank_account_service.Mappers;

import com.example.bank_account_service.Dtos.BankAccountRequestDto;
import com.example.bank_account_service.Dtos.BankAccountResponseDto;
import com.example.bank_account_service.Entities.BankAccount;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class BankAccountMapper {
    private CustomerMapper customerMapper;

   public BankAccountResponseDto fromBankAccount(BankAccount bankAccount){
        BankAccountResponseDto bankAccountResponseDto=new BankAccountResponseDto();
        BeanUtils.copyProperties(bankAccount,bankAccountResponseDto);
        bankAccountResponseDto.setCreatedAt(new Date());
        if(bankAccount.getCustomer()!=null){
            bankAccountResponseDto.setCustomerResponseDto(customerMapper.fromCustomer(bankAccount.getCustomer()));
        }
        return bankAccountResponseDto;
    }

}
