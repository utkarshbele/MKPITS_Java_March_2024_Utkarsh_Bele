package com.example.bankingapp.rest_controller;

import com.example.bankingapp.model.City;
import com.example.bankingapp.model.Country;
import com.example.bankingapp.model.District;
import com.example.bankingapp.model.State;
import com.example.bankingapp.service.CityService;
import com.example.bankingapp.service.CountryService;
import com.example.bankingapp.service.DistrictService;
import com.example.bankingapp.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/api")
public class AddressRestController {
        private CountryService countryService;
        private StateService stateService;
        private DistrictService districtService;
        private CityService cityService;

        @Autowired
        public AddressRestController(CountryService countryService, StateService stateService, DistrictService districtService, CityService cityService) {
            this.countryService = countryService;
            this.stateService = stateService;
            this.districtService = districtService;
            this.cityService = cityService;
        }

        @GetMapping("/countries")
        public List<Country> getAllCountries() {
            return countryService.getAllCountries();
        }

        // Fetch states by country id
        @GetMapping("/states/{countryId}")
        public List<State> getStatesByCountry(@PathVariable int countryId) {
            return stateService.getStatesByCountryId(countryId);
        }

        // Fetch districts by state id
        @GetMapping("/districts/{stateId}")
        public List<District> getDistrictsByState(@PathVariable int stateId) {
            return districtService.getDistrictsByStateId(stateId);
        }

        // Fetch cities by district id
        @GetMapping("/cities/{districtId}")
        public List<City> getCitiesByDistrict(@PathVariable int districtId) {
            return cityService.getCitiesByDistrictId(districtId);
        }
    }