package com.fermed.DAO.impl;

import com.fermed.DAO.DatabaseDAO;
import com.fermed.DAO.DoctorDAO;
import com.fermed.DTO.DoctorDTO;
import com.fermed.model.Doctor;
import org.springframework.stereotype.Component;

import javax.print.Doc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
            System.out.println("DOCTOR REGISTERED SUCCESSFULLY! :)");
        }catch (SQLException e){
            e.printStackTrace();
        }




    }

    @Override
    public void loginDoctor(String email, String password)throws SQLException {

        Connection connection;
        connection =  DatabaseDAO.getConnection();


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

               }
           }


        }catch (SQLException e){
            e.getMessage();
        }

    }

    //for testing
    @Override
    public void doctorData(DoctorDTO doctorDTO) throws Exception {

        Connection connection;
        connection =  DatabaseDAO.getConnection();

        ArrayList doctorData = new ArrayList();

        try {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT name, surname, gender, username ,email  FROM doctor WHERE email = '"+doctorDTO.getEmail()+"'");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){

                ArrayList data = new ArrayList();
                data.add(resultSet.getString(1));
                data.add(resultSet.getString(2));
                data.add(resultSet.getString(3));
                data.add(resultSet.getString(4));
                data.add(resultSet.getString(5));
                doctorData.add(data);
                System.out.println("Doctor Data is: " + data);
        }

    } catch (Exception ex) {
           ex.printStackTrace();

        }
    }









    }

