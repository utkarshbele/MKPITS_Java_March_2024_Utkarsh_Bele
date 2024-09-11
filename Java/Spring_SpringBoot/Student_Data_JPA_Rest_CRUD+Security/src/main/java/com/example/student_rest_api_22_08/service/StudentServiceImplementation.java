package com.example.student_rest_api_22_08.service;

import com.example.student_rest_api_22_08.entity.Student;
import com.example.student_rest_api_22_08.repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplementation implements StudentService{
    private StudentRepository  studentRepository;
    public StudentServiceImplementation(StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;
    }
    @Override
    public Student findById(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void update(Student student) {
        //Optional<Student> studentOptional =studentRepository.findById(student.getId());
        if(student!=null)
        {
            studentRepository.save(student);
        }
    }

    @Override
    public void delete(int id) {
        studentRepository.deleteById(id);
    }
}
