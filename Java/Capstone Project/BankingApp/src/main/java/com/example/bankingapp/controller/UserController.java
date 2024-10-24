package com.example.bankingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/profile")
    public String viewProfile() {
        // logic to show user profile
        return "user/profile"; // return the profile page for the user
    }

    @GetMapping("/transactions")
    public String viewTransactions() {
        // logic to show user transactions
        return "user/transactions"; // return the transactions page for the user
    }

    @GetMapping("/fund-transfer")
    public String fundTransfer() {
        // logic for fund transfer
        return "user/fund_transfer"; // return fund transfer page
    }
}
