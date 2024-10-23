package com.example.bankingapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Period;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;

    private String lastName;

    private int age;

    private LocalDate dob;

    private String address;

    private String phoneNumber;

    private String gender;

    @OneToOne(mappedBy = "userDetails",cascade = CascadeType.ALL)
    private Users users;

    public void setUsers(Users users) {
        this.users = users;
        users.setUserDetails(this);
    }
}
