package com.example.bankingapp.service;

import com.example.bankingapp.model.Account;
import com.example.bankingapp.model.AccountType;

import java.math.BigDecimal;
import java.util.List;

public interface AccountService {
    List<Account> getUserAccounts(int userId);
    Account createAccount(int userId, AccountType accountType, BigDecimal initialDeposit);
}
