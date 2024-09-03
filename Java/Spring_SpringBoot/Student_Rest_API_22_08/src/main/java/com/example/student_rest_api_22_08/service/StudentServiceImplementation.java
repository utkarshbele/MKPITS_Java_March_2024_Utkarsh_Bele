package com.example.student_rest_api_22_08.service;

import com.example.student_rest_api_22_08.dao.StudentDAO;
import com.example.student_rest_api_22_08.entity.Student;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImplementation implements StudentService{
    StudentDAO studentDAO;
    public StudentServiceImplementation(StudentDAO studentDAO)
    {
        this.studentDAO=studentDAO;
    }
    @Override
    public Student find(int id) {
        return studentDAO.find(id);
    }

    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    public void save(Student student) {
        studentDAO.save(student);
    }

    @Override
    public void update(Student student) {
        studentDAO.update(student);
    }

    @Override
    public void delete(int id) {
        studentDAO.delete(id);
    }
}
