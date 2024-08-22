package com.example.demo.controller;

import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/main", method = RequestMethod.GET)
public class MyController {
    ArrayList<Student> stud;
    public MyController()
    {
        stud=new ArrayList();
    }
    @Value("${company.name}")
    private String companyName;

    @GetMapping("/hello")
    public String sayHello()
    {
        return "<h1>Hello"+ companyName+"<h1>";
    }

    @GetMapping("/list")
    public String list()
    {
        return "<h1>Hello Students <h1>";
    }

    @GetMapping("/Students")
    public ArrayList<Student> studentList()
    {
        ArrayList<Student> students=new ArrayList<Student>();
        Student s1=new Student("101","Utkarsh","Yavatmal");
        Student s2=new Student("102","Utku","Yawadi");
        Student s3=new Student("103","USB","Nagpur");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        return students;
    }

    @GetMapping("/create")
    public Student createStudent(@RequestParam(name="id") String id, @RequestParam(name="name") String name,@RequestParam(name="city") String city)
    {
        Student student=new Student(id,name,city);
        stud.add(student);
        return student;
    }

    @GetMapping("/getId")
    public Student studentList(@RequestParam(name="id") String id) //@PathVariable{id}
    {
        for(Student stud1: stud)      //return stud.stream.filter(student -> student.getId().equals(id)).findFirst().orElse(null);
        {
            if(stud1.getId().equals(id))
            {return stud1;}
        }
        return null;
    }

    @GetMapping("/display")
    public ArrayList<Student> studentDisplay()
    {
        return stud;
    }
}
