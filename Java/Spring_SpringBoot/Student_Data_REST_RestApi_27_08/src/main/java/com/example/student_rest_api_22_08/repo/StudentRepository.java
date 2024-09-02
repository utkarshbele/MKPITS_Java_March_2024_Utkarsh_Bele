package com.example.student_rest_api_22_08.repo;

import com.example.student_rest_api_22_08.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "members")
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
