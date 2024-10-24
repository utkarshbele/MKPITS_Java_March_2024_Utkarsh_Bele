package com.example.bankingapp.service;

import com.example.bankingapp.model.Country;
import com.example.bankingapp.repo.CountryRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryServiceImpl implements CountryService {

    private CountryRepo countryRepo;
    @Override
    public List<Country> getAllCountries() {
        return countryRepo.findAll();
    }
}
