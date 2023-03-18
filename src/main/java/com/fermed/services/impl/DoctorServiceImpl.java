package com.fermed.services.impl;


import com.fermed.DAO.DatabaseDAO;
import com.fermed.DTO.DoctorDTO;
import com.fermed.services.DoctorService;
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
    public DoctorDTO createDoctor(DoctorDTO doctorDTO) throws Exception {
        String name = doctorDTO.getName();
        String surname = doctorDTO.getSurname();
        String gender = doctorDTO.getGender();
        //int id_type_of_doctor  = doctorDTO.getId_type_of_doctor();
        //int insurance_id_insurance = doctorDTO.getInsurance_id_insurance();
        String email = doctorDTO.getEmail();
        String password = doctorDTO.getPassword();
        String username = doctorDTO.getUsername();

        String insertQuery = "INSERT INTO doctor(name, surname, gender, email, password, username) " +
                "VALUES('"+name+"','"+surname+"','"+gender+"','"+email+"','"+password+"','"+username+"')";

        try{
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                preparedStatement.executeUpdate();
                System.out.println("DOCTOR DATA INSERTED SUCCESSFULLY!");
    }catch (SQLException e){
            e.printStackTrace();
        }
        return doctorDTO;
    }

}