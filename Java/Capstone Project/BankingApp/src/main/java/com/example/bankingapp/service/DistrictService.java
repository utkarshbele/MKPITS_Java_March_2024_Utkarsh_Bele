package com.example.bankingapp.service;

import com.example.bankingapp.model.District;
import java.util.List;
public interface DistrictService {

    List<District> getDistrictsByStateId(int stateId);
}
