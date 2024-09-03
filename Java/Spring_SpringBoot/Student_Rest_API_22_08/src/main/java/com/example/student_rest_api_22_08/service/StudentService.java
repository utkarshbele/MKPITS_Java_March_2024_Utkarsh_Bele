package com.example.student_rest_api_22_08.service;

import com.example.student_rest_api_22_08.entity.Student;

import java.util.List;

public interface StudentService {
    Student find(int id);
    List<Student> findAll();
    void save(Student student);
    void update(Student student);
    void delete(int id);
}
