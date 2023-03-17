package com.fermed.services.impl;

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
public class DoctorServiceImpl implements DoctorService {

    Connection connection;

    public DoctorServiceImpl() throws SQLException {
       connection =  DatabaseDAO.getConnection();
    }

    @Override
    public void createDoctor(Doctor doctor) throws Exception {
        String name = doctor.getName();
        String surname = doctor.getSurname();
        String gender = doctor.getGender();
        int id_type_of_doctor  = doctor.getId_type_of_doctor();
        int insurance_id_insurance = doctor.getInsurance_id_insurance();
        String email = doctor.getEmail();
        String password = doctor.getPassword();
        String username = doctor.getUsername();

        String insertQuery = "INSERT INTO doctor(name, surname, gender, id_type_of_doctor, insurance_id_insurance, email, password, username) " +
                "VALUES('"+name+"','"+surname+"','"+gender+"',"+id_type_of_doctor+","+insurance_id_insurance+",'"+email+"','"+password+"','"+username+"')";

        try{
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                preparedStatement.executeUpdate();
                System.out.println("DOCTOR DATA INSERTED SUCCESSFULLY!");
    }catch (SQLException e){
            e.printStackTrace();
        }
    }
}