package com.example.bankingapp.repo;

import com.example.bankingapp.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepo extends JpaRepository<City, Integer> {
    List<City> findByDistrictId(int districtId);
}
