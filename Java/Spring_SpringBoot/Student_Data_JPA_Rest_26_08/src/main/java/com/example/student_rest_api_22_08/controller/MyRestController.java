package com.example.student_rest_api_22_08.controller;

import com.example.student_rest_api_22_08.entity.Student;
import com.example.student_rest_api_22_08.service.StudentService;
import com.example.student_rest_api_22_08.student_exception.StudentNotFoundException;
import com.example.student_rest_api_22_08.student_exception.Student_Error_Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin(value = "*")
//the above annotation is for this rest api calling from frontend
@RequestMapping(value = "/main", method = RequestMethod.GET)
public class MyRestController {
    private StudentService service;

    public MyRestController(StudentService service)
    {
        this.service=service;
    }


    @GetMapping("/students")
    public List<Student> studentList()
    {
        return service.findAll();
    }


//    @GetMapping("/getId")
//    public Student studentById(@RequestParam(name="id") int id) //@PathVariable{id}
//    {
//            //return stud.stream.filter(student -> student.getId().equals(id)).findFirst().orElse(null);
//        return service.find(id);
//    }
    //another way to the above method
    @GetMapping("/student/{id}")
    public ResponseEntity<Student> studentByID(@PathVariable("id") Integer id) {
        if (id <= 0 || id >=100)
        {
            throw new StudentNotFoundException("Student with Id "+id+" Not Found");
        }
            Student student = service.findById(id);
            return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // Create a new student
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        service.save(student);
        return student;
    }

    // Update an existing student
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        Student existingStudent = service.findById(id);
        if (existingStudent != null) {
            existingStudent.setFirstName(updatedStudent.getFirstName());
            existingStudent.setLastName(updatedStudent.getLastName());
            existingStudent.setEmail(updatedStudent.getEmail());
            service.update(existingStudent);
        }
        return existingStudent;
    }

     //Delete a student by ID
    @DeleteMapping("students/{id}")
    public String deleteStudent(@PathVariable int id) {
        service.delete(id);
        return "Student with ID " + id + " has been deleted.";
    }

    //this is a local controller exception handler
//    @ExceptionHandler
//    public ResponseEntity<Student_Error_Response> handleException(StudentNotFoundException ex)
//    {
//        Student_Error_Response error = new Student_Error_Response();
//        error.setStatus(HttpStatus.NOT_FOUND.value());
//        error.setMessage(ex.getMessage());
//        error.setTimestamp(System.currentTimeMillis());
//
//        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//    }

}
