package com.fermed.facades;



import com.fermed.DTO.PatientDTO;
import com.fermed.DTO.PatientLoginDTO;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public interface PatientFacade {

        //creating patient
     void createPatient(PatientDTO patientDTO) throws SQLException, Exception;


    //this method is needed for login
    void loginPatient(PatientLoginDTO patientLoginDTO) throws Exception;


    void getSinglePatient(PatientDTO patientDTO, int id_patient);
}
