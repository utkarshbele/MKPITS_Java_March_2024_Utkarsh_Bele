package com.example.student_rest_api_22_08.dao;

import com.example.student_rest_api_22_08.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImplementation implements StudentDAO{

    private EntityManager entityManager;

    public StudentDAOImplementation(EntityManager entityManager)
    {
        this.entityManager=entityManager;
    }


    @Override
    public Student find(int id) {
        Student student=entityManager.find(Student.class,id);
        return student;
    }

    @Override
    public List<Student> findAll() {
        //TypedQuery<Student> query = entityManager.createQuery("FROM Student", Student.class);
        //return query.getResultList();
        //use JPQL or SQL below
        Query query= entityManager.createQuery("select id,firstName,lastName,email from Student");
        return query.getResultList();
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Student student = entityManager.find(Student.class, id);
        if (student != null) {
            entityManager.remove(student);
        }
    }
}

