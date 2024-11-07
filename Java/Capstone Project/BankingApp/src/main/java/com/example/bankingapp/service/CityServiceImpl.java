package com.example.bankingapp.service;

import com.example.bankingapp.model.City;
import com.example.bankingapp.repo.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepo cityRepo;
    @Override
    public List<City> getCitiesByDistrictId(int districtId) {
        return cityRepo.findByDistrictId(districtId);
    }
}
