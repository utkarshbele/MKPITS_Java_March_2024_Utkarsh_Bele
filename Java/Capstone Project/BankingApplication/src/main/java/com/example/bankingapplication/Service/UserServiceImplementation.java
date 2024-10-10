package com.example.bankingapplication.Service;

import com.example.bankingapplication.Entity.Role;
import com.example.bankingapplication.Entity.Users;
import com.example.bankingapplication.Entity.Users_Details;
import com.example.bankingapplication.Repo.RoleRepo;
import com.example.bankingapplication.Repo.UsersDetailsRepo;
import com.example.bankingapplication.Repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.bankingapplication.DTO.RequestDTO;

import java.util.ArrayList;

@Service
public class UserServiceImplementation implements UserService {
    private UsersRepo userRepository;
    private UsersDetailsRepo userDetailsRepository;
    private RoleRepo roleRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImplementation(UsersRepo userRepository, UsersDetailsRepo userDetailsRepository, RoleRepo roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userDetailsRepository = userDetailsRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Users registerUser(RequestDTO requestDTO) {
        // Create user details
        Users_Details userDetails = new Users_Details();
        userDetails.setFirstName(requestDTO.getFirstName());
        userDetails.setLastName(requestDTO.getLastName());
        userDetails.setAge(requestDTO.getAge());
        userDetails.setEmail(requestDTO.getEmail());
        userDetails.setPhoneNumber(requestDTO.getPhoneNumber());
        userDetails.setAddress(requestDTO.getAddress());
        userDetails.setGender(requestDTO.getGender());
        // Create user
        Users user = new Users();
        user.setUsername(requestDTO.getUsername());
        user.setPassword(passwordEncoder.encode(requestDTO.getPassword()));
        user.setUsers_details(userDetails);
        user.setEnable(1);

        // Assign default role as "User"
        Role defaultRole = roleRepository.findByRoleName("ROLE_USER");
        user.setRoles(new ArrayList<>());
        user.getRoles().add(defaultRole);

        // Save user
        return userRepository.save(user);
    }
}
