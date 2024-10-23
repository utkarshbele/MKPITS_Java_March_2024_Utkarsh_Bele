package com.example.bankingapp.service;

import com.example.bankingapp.dto.Request_Response_DTO;
import com.example.bankingapp.model.Role;
import com.example.bankingapp.model.UserDetails;
import com.example.bankingapp.model.Users;
import com.example.bankingapp.repo.RoleRepo;
import com.example.bankingapp.repo.UserDetailsRepo;
import com.example.bankingapp.repo.UserRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import java.util.ArrayList;

@Service
public class UserServiceImplementation implements UserService {
    @PersistenceContext
    private EntityManager entityManager;
    private final UserRepo userRepository;
    private final UserDetailsRepo userDetailsRepository;
    private final RoleRepo roleRepository;
    //private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImplementation(UserRepo userRepository, UserDetailsRepo userDetailsRepository,
                                     RoleRepo roleRepository ) {
        this.userRepository = userRepository;
        this.userDetailsRepository = userDetailsRepository;
        this.roleRepository = roleRepository;
        //this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public Users registerUser(Request_Response_DTO requestDTO) {
        System.out.println("Registering user: " + requestDTO.getEmail());

        // Check if user with the same email already exists
        if (userRepository.existsByEmail(requestDTO.getEmail())) {
            System.out.println("User already exists with email: " + requestDTO.getEmail());
            throw new RuntimeException("User with this email already exists");
        }

        // Create user details
        UserDetails userDetails = new UserDetails();
        userDetails.setFirstName(requestDTO.getFirstName());
        userDetails.setLastName(requestDTO.getLastName());
        userDetails.setAge(requestDTO.getAge());
        userDetails.setPhoneNumber(requestDTO.getPhoneNumber());
        userDetails.setAddress(requestDTO.getAddress());
        userDetails.setGender(requestDTO.getGender());
        userDetails.setDob(requestDTO.getDob());

        // Create user
        Users user = new Users();
        user.setEmail(requestDTO.getEmail());
        user.setPassword("{noop}"+requestDTO.getPassword()); // Ensure password encoding
        user.setUserDetails(userDetails);
        user.setEnabled(true); // Set the user to enabled

        // Assign default role as "User"
        Role defaultRole = roleRepository.findRoleByRoleName("ROLE_USER");
        if (defaultRole != null) {
            user.setRoles(new ArrayList<>());
            user.getRoles().add(defaultRole);
            System.out.println("Assigned role: " + defaultRole.getRoleName());
        } else {
            System.out.println("Default role not found");
            throw new RuntimeException("Default role not found");
        }

        // Save the user
        Users savedUser = userRepository.save(user);
        System.out.println("User registered successfully: " + savedUser.getEmail());

        // Flush the entity manager to ensure the data is written to the database
        entityManager.flush();
        return savedUser;
    }
}
