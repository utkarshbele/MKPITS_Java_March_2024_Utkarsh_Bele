package com.example.bankingapp.service;

import com.example.bankingapp.model.District;
import com.example.bankingapp.repo.DistrictRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DistrictServiceImpl implements DistrictService {
    private DistrictRepo districtRepo;

    @Override
    public List<District> getDistrictsByStateId(int stateId) {
        return districtRepo.findByStateId(stateId);
    }
}
