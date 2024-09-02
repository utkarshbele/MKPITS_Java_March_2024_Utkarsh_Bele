package com.example.student_rest_api_22_08.student_exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student_Error_Response {
    private int status;
    private String message;
    private long timestamp;
}
