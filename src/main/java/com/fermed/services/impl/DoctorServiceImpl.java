package com.fermed.services.impl;


import com.fermed.DAO.DatabaseDAO;
import com.fermed.DTO.DoctorData;
import com.fermed.model.Doctor;
import com.fermed.services.DoctorService;
import org.springframework.stereotype.Service;

import javax.print.Doc;
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
    public void createDoctor(DoctorData doctorData) throws Exception {
        //CONVERSION FROM DTO -> DATA
        Doctor doctor = new Doctor();
        doctor.setName(doctorData.getName());
        doctor.setSurname(doctorData.getSurname());
        doctor.setGender(doctorData.getGender());
        doctor.setEmail(doctorData.getEmail());
        doctor.setUsername(doctorData.getUsername());
        doctor.setPassword(doctorData.getPassword());
        
        String insertQuery = "INSERT INTO doctor(name, surname, gender, email, password, username) " +
                "VALUES('"+name+"','"+surname+"','"+gender+"','"+email+"','"+password+"','"+username+"')";

        try{
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                preparedStatement.executeUpdate();
                System.out.println("DOCTOR DATA INSERTED SUCCESSFULLY!");
    }catch (SQLException e){
            e.printStackTrace();
        }

    }

}