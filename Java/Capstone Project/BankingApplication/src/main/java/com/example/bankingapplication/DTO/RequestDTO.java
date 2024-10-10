package com.example.bankingapplication.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestDTO {

    @Column(nullable = false, unique = true)
    @Size(min = 1, max = 128, message = "username length must be between 0 to 128")
    @NotEmpty(message = "username should not be empty")
    private String username;

    @Column(nullable = false)
    @Size(min = 8, max = 128, message = "password length must be between 0 to 128")
    @NotEmpty(message = "password should not be empty")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,128}$",
            message = "Password must meet requirements (8-128 chars, uppercase, lowercase, digit, special char)")
    private String password;

    @Column(nullable = false)
    @Size(min = 1, max = 128, message = "first name length must be between 0 to 128")
    @NotEmpty(message = "first name should not be empty")
    private String firstName;

    @Column(nullable = false)
    @Size(min = 1, max = 128, message = "last name length must be between 0 to 128")
    @NotEmpty(message = "last name should not be empty")
    private String lastName;

    @Column(nullable = false, unique = true)
    @Size(min = 1, max = 128, message = "email length must be between 0 to 128")
    @NotEmpty(message = "email should not be empty")
    @Pattern(regexp = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$", message = "Invalid email address")
    private String email;

    @Column(nullable = false, unique = true)
    @Size(min = 1, max = 15, message = "phone number length must be between 0 to 15")
    @NotEmpty(message = "phone number should not be empty")
    @Pattern(regexp = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$", message = "Invalid phone number")
    private String phoneNumber;

    @Column(nullable = false)
    private String gender;

    @NotNull(message = "Age is required")
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 120, message = "Age must be less than 120")
    private int age;

    @Column(nullable = false)
    @Size(min = 1, max = 500, message = "address length must be between 0 to 500")
    @NotEmpty(message = "address should not be empty")
    private String address;

    private String role;

    private String fromAccountNumber;
    private String toAccountNumber;
    private BigDecimal amount;
}
