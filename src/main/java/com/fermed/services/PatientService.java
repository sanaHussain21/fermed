package com.fermed.services;
import com.fermed.DTO.PatientData;



public interface PatientService {

    //creating patient
     void createPatient(PatientData patientData) throws Exception;

    void loginPatient(String email, String password) throws Exception;
}
