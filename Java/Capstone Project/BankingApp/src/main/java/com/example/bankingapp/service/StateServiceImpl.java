package com.example.bankingapp.service;

import com.example.bankingapp.model.State;
import com.example.bankingapp.repo.StateRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StateServiceImpl implements StateService{
    private StateRepo stateRepo;
    @Override
    public List<State> getStatesByCountryId(int countryId) {
        return stateRepo.findByCountryId(countryId);
    }
}
