package com.example.springjpa_hibernate.dao;

import com.example.springjpa_hibernate.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImplementation implements StudentDAO{

    private EntityManager entityManager;

    public StudentDAOImplementation(EntityManager entityManager)
    {
        this.entityManager=entityManager;
    }

    @Transactional
    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student read(int id) {
        Student student=entityManager.find(Student.class,id);
        System.out.println(id+" "+student.getFirstName()+" "+student.getLastName()+" "
                +student.getEmail());
        return student;
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Student student=entityManager.find(Student.class,id);
        entityManager.remove(student);
        System.out.println("Deleted the Student with Id: "+id);
    }


}
