package com.fermed.DAO;


import com.fermed.DTO.PatientDTO;
import com.fermed.model.Patient;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public interface PatientDAO {
    void createPatient(Patient patient) throws SQLException;

    void loginPatient(String email, String password) throws SQLException;

    void getSinglePatient(PatientDTO patientDTO, int id_patient);
}
