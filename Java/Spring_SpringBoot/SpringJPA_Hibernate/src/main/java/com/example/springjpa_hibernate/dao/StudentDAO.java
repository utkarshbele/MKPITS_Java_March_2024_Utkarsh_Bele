package com.example.springjpa_hibernate.dao;

import com.example.springjpa_hibernate.entity.Student;

public interface StudentDAO {
    void save(Student student);
    Student read(int id);
    void update(Student student);
    void delete(int id);
}

