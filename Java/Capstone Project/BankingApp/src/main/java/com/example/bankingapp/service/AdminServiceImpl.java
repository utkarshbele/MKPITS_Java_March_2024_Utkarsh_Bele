package com.example.bankingapp.service;

import com.example.bankingapp.dto.Request_Response_DTO;
import com.example.bankingapp.model.Role;
import com.example.bankingapp.model.Users;
import com.example.bankingapp.repo.RoleRepo;
import com.example.bankingapp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminServiceImpl implements AdminService {

    private final UserRepo userRepository;
    private final RoleRepo roleRepository;

    @Autowired
    public AdminServiceImpl(UserRepo userRepository, RoleRepo roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Request_Response_DTO> findAllUsers() {
        return userRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public Request_Response_DTO findUserById(int id) {
        Users user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        return convertToDto(user);
    }

    @Override
    public void updateUser(Request_Response_DTO userDto) {
        Users user = userRepository.findById(userDto.getId())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        // Update user details based on the DTO
        user.setEmail(userDto.getEmail());
        user.setEnabled(userDto.isEnabled());

        // Update UserDetails
        if (user.getUserDetails() != null) {
            user.getUserDetails().setFirstName(userDto.getFirstName());
            user.getUserDetails().setLastName(userDto.getLastName());
            user.getUserDetails().setAge(userDto.getAge());
            user.getUserDetails().setDob(userDto.getDob());
            user.getUserDetails().setAddress(userDto.getAddress());
            user.getUserDetails().setPhoneNumber(userDto.getPhoneNumber());
            user.getUserDetails().setGender(userDto.getGender());
        }

        userRepository.save(user);  // Ensure the user is saved correctly
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public void toggleUserStatus(int id) {
        Users user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        // Toggle the user's enabled status
        user.setEnabled(!user.isEnabled());
        userRepository.save(user);  // Save the updated user
    }

    @Override
    public void assignRole(int userId, int roleId) {
        Users user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        Role role = roleRepository.findById(roleId)
                .orElseThrow(() -> new IllegalArgumentException("Role not found"));

        // Initialize the roles list if it's null
        if (user.getRoles() == null) {
            user.setRoles(new ArrayList<>());
        }

        // Add the role to the user if it isn't already assigned
        if (!user.getRoles().contains(role)) {
            user.getRoles().add(role);
        }

        userRepository.save(user);  // Save the updated user
    }
    //Role Management: The Role class should also have an appropriate equals and hashCode
    // method so that the contains check works correctly.
    @Override
    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    // Helper method to convert Users entity to Request_Response_DTO
    private Request_Response_DTO convertToDto(Users user) {
        Request_Response_DTO dto = new Request_Response_DTO();
        dto.setId(user.getId());  // Set the ID in DTO
        dto.setEmail(user.getEmail());
        dto.setEnabled(user.isEnabled());
        if (user.getUserDetails() != null) {
            dto.setFirstName(user.getUserDetails().getFirstName());
            dto.setLastName(user.getUserDetails().getLastName());
            dto.setAge(user.getUserDetails().getAge());
            dto.setDob(user.getUserDetails().getDob());
            dto.setAddress(user.getUserDetails().getAddress());
            dto.setPhoneNumber(user.getUserDetails().getPhoneNumber());
            dto.setGender(user.getUserDetails().getGender());
        }
        return dto;
    }
}
