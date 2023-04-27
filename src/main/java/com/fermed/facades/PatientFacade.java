package com.fermed.facades;



import com.fermed.DTO.PatientDTO;
import com.fermed.DTO.PatientLoginDTO;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public interface PatientFacade {

        //creating patient
     void createPatient(PatientDTO patientDTO) throws SQLException, Exception;


    //this method is needed for login
    void loginPatient(PatientLoginDTO patientLoginDTO) throws Exception;

    //this method is needed to create the appoitnment
    void createAppointment(PatientDTO patientDTO);
}
