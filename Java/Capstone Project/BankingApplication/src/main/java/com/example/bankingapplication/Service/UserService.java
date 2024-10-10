package com.example.bankingapplication.Service;

import com.example.bankingapplication.DTO.RequestDTO;
import com.example.bankingapplication.Entity.Users;

public interface UserService {
    Users registerUser(RequestDTO requestDTO);
}
