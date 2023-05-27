package com.fermed.services;
import com.fermed.DTO.PatientDTO;
import com.fermed.DTO.PatientData;

import java.util.List;


public interface PatientService {

    //creating patient
     void createPatient(PatientData patientData) throws Exception;

    void loginPatient(String email, String password) throws Exception;

    void getSinglePatient(PatientDTO patientDTO, int id_patient);
}
