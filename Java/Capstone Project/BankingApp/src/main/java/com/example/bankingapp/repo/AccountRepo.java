package com.example.bankingapp.repo;

import com.example.bankingapp.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
    boolean existsByAccountNumber(String accountNumber);
    List<Account> findByUserId(int userId);
}
