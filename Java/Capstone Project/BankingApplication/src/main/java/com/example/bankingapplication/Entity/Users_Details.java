package com.example.bankingapplication.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Users_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;

    private String lastName;

    private int age;

    private String dob;

    private String address;

    private String phoneNumber;

    private String gender;

    @OneToOne(mappedBy = "users_details",cascade = CascadeType.ALL)
    private Users users;

    @CreatedBy
    private Integer createdBy;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @PrePersist
    public void prePersist() {
        this.createdBy=getCurrentUserId();
        this.createdDate= LocalDateTime.now();
    }

    public Integer getCurrentUserId() {
        Integer user_id=users.getId();
        return user_id;
    }
}
