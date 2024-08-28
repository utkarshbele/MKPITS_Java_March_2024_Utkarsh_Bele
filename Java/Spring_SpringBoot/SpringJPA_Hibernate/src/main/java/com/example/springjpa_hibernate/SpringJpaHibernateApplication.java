package com.example.springjpa_hibernate;

import com.example.springjpa_hibernate.dao.StudentDAO;
import com.example.springjpa_hibernate.dao.StudentDAOImplementation;
import com.example.springjpa_hibernate.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaHibernateApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
    {
        return runner ->{
            createStudent(studentDAO);
            //readStudent(studentDAO,1);
            //updateStudent(studentDAO,1);
            //delete(studentDAO,1);
        };
    }

    public void createStudent(StudentDAO studentDAO)
    {
        Student student=new Student("Utkarsh","Bele","utkarsh@gmail.com");
        studentDAO.save(student);
    }

    public void readStudent(StudentDAO studentDAO, int id)
    {
        studentDAO.read(id);
    }

    public void updateStudent(StudentDAO studentDAO,int id)
    {
        Student student = studentDAO.read(id);
        if(student!=null)
        {
            student.setFirstName("USB");
            student.setLastName("Bro");
            student.setEmail("usb@gmail.com");
            studentDAO.update(student);
            System.out.println("Student record updated");
        }
    }

    public void delete(StudentDAO studentDAO,int id)
    {
        studentDAO.delete(id);
    }
}
