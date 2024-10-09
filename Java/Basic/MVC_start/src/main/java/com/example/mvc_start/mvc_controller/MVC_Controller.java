package com.example.mvc_start.mvc_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/api", method = RequestMethod.POST)
public class MVC_Controller {
    @GetMapping("/hello")
    public String processForm(@RequestParam("name") String name, Model model)
    {
        model.addAttribute("message","welcome to mvc");
        model.addAttribute("fullname",name);
        return "Hello";
    }

    @GetMapping("/form")
    public String displayForm(Model model)
    {
        return "enter_form";
    }


}
