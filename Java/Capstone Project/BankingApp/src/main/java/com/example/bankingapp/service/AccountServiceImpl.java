package com.example.bankingapp.service;

import com.example.bankingapp.model.Account;
import com.example.bankingapp.model.AccountType;
import com.example.bankingapp.model.Users;
import com.example.bankingapp.repo.AccountRepo;
import com.example.bankingapp.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepo accountRepository;
    private final UserRepo userRepository;

    public AccountServiceImpl(AccountRepo accountRepository, UserRepo userRepository) {
        this.accountRepository = accountRepository;
        this.userRepository = userRepository;
    }

    public List<Account> getUserAccounts(int userId) {
        return accountRepository.findByUserId(userId);
    }

    private String generateAccountNumber() {
        // Logic for unique account number
        return String.valueOf(System.currentTimeMillis());
    }

    @Override
    public Account createAccount(int userId, AccountType accountType, BigDecimal initialDeposit) {
        Users user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Generate account number
        String accountNumber = generateAccountNumber();

        Account account = new Account();
        account.setAccountNumber(accountNumber);
        account.setAccountType(accountType);
        account.setBalance(initialDeposit);
        account.setUser(user);

        return accountRepository.save(account);
    }
}
