package com.fermed.facades.impl;

import com.fermed.DTO.PatientDTO;
import com.fermed.DTO.PatientData;
import com.fermed.DTO.PatientLoginDTO;
import com.fermed.facades.PatientFacade;
import com.fermed.services.PatientService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;


@Component
public class PatientFacadeImpl implements PatientFacade {


    @Resource
    private PatientService patientService;


    @Override
    public void createPatient(PatientDTO patientDTO) throws Exception {
        //CONVERSION FROM DTO -> DATA
        PatientData patientData = new PatientData();
        patientData.setName(patientDTO.getName());
        patientData.setSurname(patientDTO.getSurname());
        patientData.setCodice_fiscale(patientDTO.getCodice_fiscale());
        patientData.setId_insurance(patientDTO.getId_insurance());
        patientData.setTelephone_number(patientDTO.getTelephone_number());
        patientData.setUsername(patientDTO.getUsername());
        patientData.setPassword(patientDTO.getPassword());
        patientData.setEmail(patientDTO.getEmail());
        patientService.createPatient(patientData);



    }

    @Override
    public void loginPatient(PatientLoginDTO patientLoginDTO) throws Exception {
        String email = patientLoginDTO.getEmail();
        String password = patientLoginDTO.getPassword();

        if (email != null && password != null) {
            patientService.loginPatient(email, password);
        }else {
            throw  new Exception("Email and Password are invalid :)");
        }
    }

    @Override
    public void getSinglePatient(PatientDTO patientDTO, int id_patient) {
        patientService.getSinglePatient(patientDTO, id_patient);

    }


}
