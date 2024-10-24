package com.example.bankingapp.service;

import com.example.bankingapp.model.City;

import java.util.List;

public interface CityService {
    List<City> getCitiesByDistrictId(int districtId);
}
