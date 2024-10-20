package com.example.bankingapp.service;

import com.example.bankingapp.dto.Request_Response_DTO;
import com.example.bankingapp.model.Users;

public interface UserService {
    Users registerUser(Request_Response_DTO request_dto);
}
