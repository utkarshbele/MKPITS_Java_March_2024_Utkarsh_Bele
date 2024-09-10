package com.example.user_management_orm_mvc.controller;

import com.example.user_management_orm_mvc.dto.RequestDTO;
import com.example.user_management_orm_mvc.entity.User;
import com.example.user_management_orm_mvc.entity.User_Details;
import com.example.user_management_orm_mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthenticationController {
    private final UserService userService;

    @Autowired
    public AuthenticationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/index")
    public String home()
    {
        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        RequestDTO user = new RequestDTO();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/register/submit")
    public String registerUserAccount(Model model, RequestDTO requestDTO) {
        User newUser = new User(requestDTO.getUsername(), requestDTO.getPassword());
        User_Details userDetails = new User_Details(
                requestDTO.getName(),
                requestDTO.getAddress(),
                requestDTO.getPhoneNo(),
                requestDTO.getEmail(),
                newUser
        );
        newUser.setUserDetails(userDetails);
        userService.save(newUser);
        model.addAttribute("user", newUser);
        return "redirect:/auth/index";
    }

}
