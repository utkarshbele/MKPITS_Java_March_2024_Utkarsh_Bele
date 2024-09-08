package com.example.mvcdatabinding2908application.controller;

import com.example.mvcdatabinding2908application.entity.Student;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/student", method=RequestMethod.GET)
public class StudentController {

    @RequestMapping(value="/showForm", method=RequestMethod.GET)
    public String showForm(Model model)
    {
        model.addAttribute("student", new Student());
        return "form";
    }

    @RequestMapping(value="/processForm", method=RequestMethod.POST)
    public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult)
    {
        System.out.println(student.toString());
        if (bindingResult.hasErrors())
        {
            return "form";
        }
        else {
            return "confirmation";
        }
    }
}
