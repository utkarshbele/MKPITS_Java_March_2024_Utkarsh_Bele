package com.example.mvcdatabinding2908application.entity;



import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Student {
    @NotNull(message = "is required") @Size(min=2, message="must be greater than 2 " +
            "characters")
    private String firstName;

    private String lastName;

    @NotNull(message = "is required") @Pattern(regexp = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", message = "Invalid email address")
    private String email;
    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;
}
