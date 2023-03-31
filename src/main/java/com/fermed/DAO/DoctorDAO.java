package com.fermed.DAO;


import com.fermed.model.Doctor;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public interface DoctorDAO {
    void createDoctor(Doctor doctor) throws SQLException;


    void loginDoctor(String email, String password) throws SQLException;

}
