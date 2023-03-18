package com.fermed.facades;


import com.fermed.DTO.PatientDTO;
import org.springframework.stereotype.Component;

@Component
public interface PatientFacade {

        //creating patient
     void createPatient(PatientDTO patientDTO);


}
