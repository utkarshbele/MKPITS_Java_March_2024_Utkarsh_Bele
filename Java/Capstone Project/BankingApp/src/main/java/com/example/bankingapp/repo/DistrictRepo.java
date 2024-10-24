package com.example.bankingapp.repo;

import com.example.bankingapp.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepo extends JpaRepository<District, Integer> {
    List<District> findByStateId(int stateId);
}
