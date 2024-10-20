package com.example.bankingapp.repo;

import com.example.bankingapp.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByEmail(String email);
    Boolean existsByEmail(String email);
}
