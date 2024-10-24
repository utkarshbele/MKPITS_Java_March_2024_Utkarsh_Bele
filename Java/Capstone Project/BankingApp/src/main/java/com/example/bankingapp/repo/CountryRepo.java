package com.example.bankingapp.repo;

import com.example.bankingapp.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country, Integer> {
}
