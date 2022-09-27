package com.example.bank_account_service.Repositories;

import com.example.bank_account_service.Entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,Long> {
}
