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
import java.sql.ResultSet;
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
            //System.out.println("Siamo passati da doctor service impl a doctor dao impl :)");
            System.out.println("DOCTOR REGISTERED SUCCESSFULLY! :)");
        }catch (SQLException e){
            e.printStackTrace();
        }




    }

    @Override
    public void loginDoctor(String email, String password)throws SQLException {

        Connection connection;
        connection =  DatabaseDAO.getConnection();

        //String selectQuery = "SELECT email , password FROM doctor WHERE email = '"+email+"' AND password = '"+password+"' ";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM doctor WHERE email = '"+email+"' AND password = '"+password+"' ");
            ResultSet resultSet = preparedStatement.executeQuery();
           while(resultSet.next()){
               if (resultSet.getString(7).equals(email) && resultSet.getString(8).equals(password)){
                   System.out.println("DOCTOR LOGIN SUCCESSFULLY!!");
                   System.out.println("DOCTOR EMAIL: "+email);
                   System.out.println("DOCTOR PASSWORD: "+password);
               }else {
                   System.out.println("DOCTOR LOGIN FAILED!!!");
                   System.out.println("DOCTOR EMAIL: "+email);
                   System.out.println("DOCTOR PASSWORD: "+password);
               }
           }


        }catch (SQLException e){
            e.getMessage();
        }

    }
/*
    @Override
    public Doctor findByEmail(String email) throws SQLException {
        Connection connection;
        connection =  DatabaseDAO.getConnection();
        String selectQuery = "SELECT email  FROM doctor WHERE email = ''";


            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.executeQuery();
            System.out.println("Doctor Email found :)");
            return findByEmail(email);
        }


        if (resultSet != null){
                    System.out.println("DOCTOR LOGIN SUCCESSFULLY!!");
                    System.out.println("DOCTOR EMAIL: "+email);
                    System.out.println("DOCTOR PASSWORD: "+password);
                }else {
                    System.out.println("DOCTOR LOGIN FAILED!!!");
                    System.out.println("DOCTOR EMAIL: "+email);
                    System.out.println("DOCTOR PASSWORD: "+password);
                }








*/
    }

