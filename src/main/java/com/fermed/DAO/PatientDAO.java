package com.fermed.DAO;

import com.fermed.DTO.PatientData;
import com.fermed.model.Patient;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public interface PatientDAO {
    void createPatient(Patient patient) throws SQLException;

    void loginPatient(String email, String password) throws SQLException;
}
