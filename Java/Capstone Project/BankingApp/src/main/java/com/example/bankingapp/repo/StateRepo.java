package com.example.bankingapp.repo;

import com.example.bankingapp.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StateRepo extends JpaRepository<State, Integer> {
    List<State> findByCountryId(int countryId);
}
