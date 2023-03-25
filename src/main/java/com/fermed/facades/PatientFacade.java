package com.fermed.facades;


import com.fermed.DTO.PatientDTO;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public interface PatientFacade {

        //creating patient
     void createPatient(PatientDTO patientDTO) throws SQLException;


}
