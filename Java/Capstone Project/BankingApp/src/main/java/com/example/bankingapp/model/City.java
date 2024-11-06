package com.example.bankingapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String cityName;

    @ManyToOne
    @JoinColumn(name = "district_id", nullable = false)
    private District district;

    @OneToMany(mappedBy = "city", cascade = CascadeType.PERSIST)
    private List<UserDetails> userDetailsList = new ArrayList<>(); // List of UserDetails

    public void addUserDetail(UserDetails userDetails) {
        userDetailsList.add(userDetails);
        userDetails.setCity(this); // Set bi-directional relationship
    }
}
