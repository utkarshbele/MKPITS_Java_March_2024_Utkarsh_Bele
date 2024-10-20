package com.example.bankingapp.repo;

import com.example.bankingapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Integer> {
    Role findRoleByRoleName(String roleName);
}
