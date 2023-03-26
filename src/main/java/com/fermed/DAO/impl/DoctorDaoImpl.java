package com.fermed.DAO.impl;

import com.fermed.DAO.DatabaseDAO;
import com.fermed.DAO.DoctorDAO;
import com.fermed.DTO.DoctorData;
import com.fermed.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class DoctorDaoImpl implements DoctorDAO {


    @Override
    public void createDoctor(Doctor doctor) throws SQLException {

        Connection connection;
        connection =  DatabaseDAO.getConnection();


        String insertQuery = "INSERT INTO doctor(name, surname, gender,id_type_of_doctor, insurance_id_insurance, email, password, username) " +
                "VALUES('"+doctor.getName()+"', '"+doctor.getSurname()+"', '"+doctor.getGender()+"', "+doctor.getId_type_of_doctor()+", "+doctor.getInsurance_id_insurance()+",  '"+doctor.getEmail()+"','"+doctor.getPassword()+"','"+doctor.getUsername()+"')";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.executeUpdate();
            System.out.println("Siamo passati da doctor service impl a doctor dao impl :)");
            System.out.println("DOCTOR DATA INSERTED SUCCESSFULLY! :)");
        }catch (SQLException e){
            e.printStackTrace();
        }




    }
}
