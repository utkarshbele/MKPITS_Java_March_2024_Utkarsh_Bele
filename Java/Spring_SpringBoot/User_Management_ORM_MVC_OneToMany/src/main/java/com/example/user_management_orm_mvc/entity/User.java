package com.example.user_management_orm_mvc.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
//    @OneToOne
//    private Set<Role> roles;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_details_id")
    private User_Details userDetails;

    @OneToMany(mappedBy ="user" ,cascade = CascadeType.ALL)
    private List<Role> roles;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}