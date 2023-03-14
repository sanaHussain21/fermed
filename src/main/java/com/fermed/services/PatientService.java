package com.fermed.services;

import com.fermed.model.Patient;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientService {

    //creating patient
    public void createPatient(Patient patient) throws Exception;

}
