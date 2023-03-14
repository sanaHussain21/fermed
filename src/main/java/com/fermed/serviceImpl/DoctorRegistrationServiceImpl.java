package com.fermed.serviceImpl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.fermed.DAO.DatabaseDAO;
import com.fermed.DTO.DoctorDTO;
import com.fermed.exception.DoctorFoundException;
import com.fermed.model.Doctor;
import com.fermed.repository.DoctorRepository;
import com.fermed.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class DoctorRegistrationServiceImpl implements DoctorService {

    Connection connection;

    public DoctorRegistrationServiceImpl() throws SQLException {
       connection =  DatabaseDAO.getConnection();
    }

    @Override
    public void createDoctor(Doctor doctor) throws Exception {
        String name = doctor.getName();
        String surname = doctor.getSurname();
        String gender = doctor.getGender();
        String email = doctor.getEmail();
        String password = doctor.getPassword();
        String username = doctor.getUsername();
         
    }
}