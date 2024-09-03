package com.example.student_rest_api_22_08.dao;
import com.example.student_rest_api_22_08.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student find(int id);
    void update(Student student);
    void delete(int id);

    List<Student> findAll();
}

