package com.example.bankingapp.controller;

import com.example.bankingapp.model.Account;
import com.example.bankingapp.model.AccountType;
import com.example.bankingapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/create")
    public String createAccountForm(Model model) {
        model.addAttribute("accountTypes", AccountType.values());
        return "account/create_account";
    }

    @PostMapping("/create")
    public String createAccount(@RequestParam int userId,
                                @RequestParam AccountType accountType,
                                @RequestParam BigDecimal initialDeposit) {
        accountService.createAccount(userId, accountType, initialDeposit);
        return "redirect:/accounts";
    }

    @GetMapping
    public String listUserAccounts(@RequestParam int userId, Model model) {
        List<Account> accounts = accountService.getUserAccounts(userId);
        model.addAttribute("accounts", accounts);
        return "account/list_accounts";
    }
}

