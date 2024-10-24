package com.example.bankingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class LoginController {

    // Display the login form
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        return "login";
    }

    @GetMapping("/landing_page")
    public String showHome(Model model) {
        return "landing_page";
    }

//    @GetMapping("/landing_page")
//    public String showLandingPage(Model model, Authentication authentication) {
//        // Based on the role, the corresponding section will be displayed
//        if (authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN"))) {
//            model.addAttribute("role", "ADMIN");
//        } else if (authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_BRANCH_MANAGER"))) {
//            model.addAttribute("role", "BRANCH_MANAGER");
//        } else {
//            model.addAttribute("role", "USER");
//        }
//        return "auth/landing_page";
//    }
}
