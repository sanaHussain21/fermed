package com.fermed.facades.impl;

import com.fermed.DTO.PatientDTO;
import com.fermed.DTO.PatientData;
import com.fermed.services.PatientService;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class PatientFacadeImpl implements PatientService {


    @Resource
    private PatientService patientService;


    @Override
    public void createPatient(PatientDTO patientDTO) {
        //CONVERSION FROM DTO -> DATA
        PatientData patientData = new PatientData();
        patientData.setName(patientDTO.getName());
        patientData.setSurname(patientDTO.getSurname());





    }
}
