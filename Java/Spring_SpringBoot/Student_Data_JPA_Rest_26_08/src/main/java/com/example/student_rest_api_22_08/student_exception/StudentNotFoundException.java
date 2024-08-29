package com.example.student_rest_api_22_08.student_exception;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String message)
    {
        super(message);   //calling super class constructor
    }
}
