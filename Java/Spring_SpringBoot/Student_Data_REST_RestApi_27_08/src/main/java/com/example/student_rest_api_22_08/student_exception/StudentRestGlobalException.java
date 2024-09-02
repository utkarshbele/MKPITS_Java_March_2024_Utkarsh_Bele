package com.example.student_rest_api_22_08.student_exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestGlobalException {
//this is a global exception handler all the controller will call this class
    @ExceptionHandler
    public ResponseEntity<Student_Error_Response> handleException(StudentNotFoundException ex)
    {
        Student_Error_Response error = new Student_Error_Response();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(ex.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
