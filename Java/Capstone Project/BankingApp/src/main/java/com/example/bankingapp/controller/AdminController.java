package com.example.bankingapp.controller;

import com.example.bankingapp.dto.Request_Response_DTO;
import com.example.bankingapp.model.Role;
import com.example.bankingapp.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", adminService.findAllUsers());
        return "admin/user_list";
    }

    @GetMapping("/edit/{id}")
    public String editUserForm(@PathVariable("id") int id, Model model) {
        Request_Response_DTO userDto = adminService.findUserById(id);
        model.addAttribute("user", userDto);
        return "admin/edit_user";
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute("user") Request_Response_DTO userDto) {
        adminService.updateUser(userDto);
        return "redirect:/admin/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        adminService.deleteUser(id);
        return "redirect:/admin/users";
    }

    @GetMapping("/toggle_status/{id}")
    public String toggleUserStatus(@PathVariable("id") int id) {
        adminService.toggleUserStatus(id);
        return "redirect:/admin/users";
    }

    @GetMapping("/add_role/{id}")
    public String assignRoleForm(@PathVariable("id") int userId, Model model) {
        List<Role> roles = adminService.findAllRoles();
        model.addAttribute("userId", userId);
        model.addAttribute("roles", roles);
        return "admin/add_role";
    }

    @PostMapping("/assign_role")
    public String assignRole(@RequestParam("userId") int userId, @RequestParam("roleId") int roleId) {
        adminService.assignRole(userId, roleId);
        return "redirect:/admin/users";
    }
}
