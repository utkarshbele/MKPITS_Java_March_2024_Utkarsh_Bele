package com.example.bankingapplication.Repo;

import com.example.bankingapplication.Entity.Users_Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDetailsRepo extends JpaRepository<Users_Details, Integer> {
}
