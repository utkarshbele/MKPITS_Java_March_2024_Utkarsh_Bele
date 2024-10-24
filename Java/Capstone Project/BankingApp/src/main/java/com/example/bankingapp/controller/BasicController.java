package com.example.bankingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {
    @GetMapping("/")
    public String showLandingPage() {
        return "home_page"; // This returns home_page.html
    }
}
