package com.example.bankingapp.repo;

import com.example.bankingapp.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer> {

}
