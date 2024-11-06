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
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String countryName;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<State> state= new ArrayList<>();

   public void addState(State state) {
        this.state.add(state);
        state.setCountry(this); // Set bi-directional relationship
    }
    //    state is correctly added to the Country’s list,
    //    while also setting the country field in State to maintain the bidirectional relationship.

}
