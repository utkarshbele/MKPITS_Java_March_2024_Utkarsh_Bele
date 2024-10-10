package com.example.bankingapplication.Repo;

import com.example.bankingapplication.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role, Integer> {

    Role findByRoleName(String roleName);
}
