package com.fermed.DAO;

import com.fermed.DTO.DoctorData;
import com.fermed.model.Doctor;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public interface DoctorDAO {
    void createDoctor(Doctor doctor) throws SQLException;

    void findByEmailAndPassword(String temporaryEmail, String temporaryPassword) throws SQLException;

    //Doctor findByEmail(String email) throws SQLException;
}
