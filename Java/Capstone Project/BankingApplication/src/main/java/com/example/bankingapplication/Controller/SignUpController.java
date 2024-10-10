package com.example.bankingapplication.Controller;

import com.example.bankingapplication.DTO.RequestDTO;
import com.example.bankingapplication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class SignUpController {

    private UserService userService;

    // Display the signup form
    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("requestDTO", new RequestDTO());
        return "signup";  // Return Thymeleaf signup template
    }

    // Handle form submission
    @PostMapping("/signup")
    public String signup(@Valid @ModelAttribute("requestDTO") RequestDTO requestDTO, BindingResult result, Model model) {
        // Validate form inputs
        if (result.hasErrors()) {
            return "signup";  // If validation fails, show the form again with error messages
        }

        try {
            // Register the user through the service
            userService.registerUser(requestDTO);
            return "redirect:/login";  // Redirect to login page on successful signup
        } catch (Exception e) {
            // Handle cases like username/email already existing
            model.addAttribute("error", "An error occurred during signup: " + e.getMessage());
            return "signup";  // Return back to signup page with error message
        }
    }
}