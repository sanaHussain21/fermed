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


    private DoctorRepository doctorRepository;


    //connecton to the database
    Connection connection;

    public DoctorRegistrationServiceImpl() throws SQLException {
        connection = DatabaseDAO.getConnection();
    }


    @Override
    public Doctor createDoctor(Doctor doctor) throws Exception {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO doctor(name, surname, gender, email, password, username) VALUES(?,?,?,?,?,?");

            //executing the query
            preparedStatement.executeQuery();
            System.out.println("Insert Completed");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctorRepository.save(doctor);
    }
}