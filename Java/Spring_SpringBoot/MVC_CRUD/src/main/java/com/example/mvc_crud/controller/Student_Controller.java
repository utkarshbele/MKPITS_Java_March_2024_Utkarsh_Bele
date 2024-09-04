package com.example.mvc_crud.controller;

import com.example.mvc_crud.model.Students;
import com.example.mvc_crud.service.StudentServiceImplementation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class Student_Controller {

    private final StudentServiceImplementation service;

    public Student_Controller(StudentServiceImplementation service) {
        this.service = service;
    }

    @GetMapping("/list")
    public String allStudentList(Model model) {
        List<Students> students = service.findAll();
        model.addAttribute("students", students);
        return "allStudentList";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("student", new Students());
        return "createStudent";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Students student) {
        service.save(student);
        return "redirect:/students/list";
    }

    @GetMapping("/edit")
    public String showUpdateForm(@RequestParam("id") int id, Model model) {
        Students student = service.findById(id);
        model.addAttribute("student", student);
        return "updateStudent";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute("student") Students student) {
        service.update(student);
        return "redirect:/students/list";
    }

    @GetMapping("/delete")
    public String deleteStudent(@RequestParam("id") int id) {
        service.delete(id);
        return "redirect:/students/list";
    }
}
