package com.example.bankingapp.service;

import com.example.bankingapp.dto.Request_Response_DTO;
import com.example.bankingapp.model.Role;

import java.util.List;

public interface AdminService {

    // Retrieve all users
    List<Request_Response_DTO> findAllUsers();

    // Find a user by ID
    Request_Response_DTO findUserById(int id);

    // Update user details
    void updateUser(Request_Response_DTO userDto);

    // Delete user by ID
    void deleteUser(int id);

    // Toggle user status (enable/disable)
    void toggleUserStatus(int id);

    // Assign a role to a user
    void assignRole(int userId, int roleId);

    // Retrieve all roles
    List<Role> findAllRoles();
}
