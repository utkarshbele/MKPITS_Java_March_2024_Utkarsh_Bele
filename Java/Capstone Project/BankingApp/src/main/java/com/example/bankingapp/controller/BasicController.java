package com.example.bankingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {
    @GetMapping("/")
    public String showLandingPage() {
        return "landing_page"; // This returns landing.html
    }
}
