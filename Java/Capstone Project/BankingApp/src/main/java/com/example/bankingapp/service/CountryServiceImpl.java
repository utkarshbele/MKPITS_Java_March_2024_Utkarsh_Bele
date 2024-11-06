package com.example.bankingapp.service;

import com.example.bankingapp.model.Country;
import com.example.bankingapp.repo.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryServiceImpl implements CountryService {

    private CountryRepo countryRepo;

    @Autowired
    public CountryServiceImpl(CountryRepo countryRepo) {
        this.countryRepo = countryRepo;
    }
    @Override
    public List<Country> getAllCountries() {
        return countryRepo.findAll();
    }
}
