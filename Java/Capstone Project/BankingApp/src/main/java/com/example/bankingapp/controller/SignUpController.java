package com.example.bankingapp.controller;

import com.example.bankingapp.dto.Request_Response_DTO;
import com.example.bankingapp.editors.date_To_LocalDate_Editor;
import com.example.bankingapp.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

@Controller
@RequestMapping("/signup")
public class SignUpController {
    private UserService userService;

    @Autowired
    public SignUpController(UserService userService) {
        super();
        this.userService = userService;
    }

    // Display the signup form
    @GetMapping("/form")
    public String showSignupForm(Model model) {
        Request_Response_DTO responseDto = new Request_Response_DTO();
        model.addAttribute("requestDTO", responseDto);
        return "signup";
    }

    // Handle form submission
    @PostMapping("/register")
    public String signup(@Valid @ModelAttribute("requestDTO") Request_Response_DTO requestDTO,
                         BindingResult result, Model model) {
        // Validate form inputs
        if (result.hasErrors()) {
            return "signup";
        }

        try {
            // Register the user through the service
            userService.registerUser(requestDTO);
            return "redirect:/signin/login";  // Redirect to login page on successful
            // signup
        } catch (Exception e) {
            // Handle cases like username/email already existing
            model.addAttribute("error", "An error occurred during signup: " + e.getMessage());
            return "signup";  // Return back to signup page with error message
        }
    }

    @InitBinder
    public void convertStudentDOB_initBinder(WebDataBinder binder) {
        System.out.println(" signup convert date_initBinder()");
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor cde = new  CustomDateEditor(sdf, false);

        binder.registerCustomEditor(java.util.Date.class, cde);
        binder.registerCustomEditor(LocalDate.class, new date_To_LocalDate_Editor() );
    }
}