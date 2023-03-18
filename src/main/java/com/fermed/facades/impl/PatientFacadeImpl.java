package com.fermed.facades.impl;

import com.fermed.DTO.PatientDTO;
import com.fermed.DTO.PatientData;
import com.fermed.facades.PatientFacade;
import com.fermed.services.PatientService;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class PatientFacadeImpl implements PatientFacade {


    @Resource
    private PatientService patientService;


    @Override
    public void createPatient(PatientDTO patientDTO) {
        //CONVERSION FROM DTO -> DATA
        PatientData patientData = new PatientData();
        patientData.setName(patientDTO.getName());
        patientData.setSurname(patientDTO.getSurname());
        patientData.setCodice_fiscale(patientDTO.getCodice_fiscale());
        patientData.setId_insurance(patientDTO.getId_insurance());
        patientData.setTelephone_number(patientDTO.getTelephone_number());
        patientData.setUsername(patientDTO.getUsername());
        patientData.setPassword(patientDTO.getPassword());
        patientData.setUsername(patientDTO.getUsername());
        patientService.createPatient(patientData);



    }
}
