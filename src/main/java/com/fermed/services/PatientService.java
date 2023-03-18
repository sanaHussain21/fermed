package com.fermed.services;

import com.fermed.DTO.PatientDTO;
import com.fermed.model.Patient;
import org.springframework.stereotype.Repository;


public interface PatientService {

    //creating patient
     void createPatient(PatientDTO patientDTO) throws Exception;

}
