package com.example.bankingapp.service;

import com.example.bankingapp.model.State;

import java.util.List;

public interface StateService {

    List<State> getStatesByCountryId(int countryId);
}
