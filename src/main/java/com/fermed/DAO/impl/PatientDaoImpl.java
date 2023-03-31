package com.fermed.DAO.impl;

import com.fermed.DAO.DatabaseDAO;
import com.fermed.DAO.PatientDAO;
import com.fermed.model.Patient;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PatientDaoImpl implements PatientDAO {
    @Override
    public void createPatient(Patient patient) throws SQLException {

        Connection connection;
        connection =  DatabaseDAO.getConnection();

        String insertQuery = "INSERT INTO patient(name, surname, codice_fiscale , id_insurance ,telephone_number , username, password, email)" +
                "VALUES('"+patient.getName()+"','"+patient.getSurname()+"',  '"+patient.getCodice_fiscale()+"', '"+patient.getId_insurance()+"', '"+patient.getTelephone_number()+"', '"+patient.getUsername()+"','"+patient.getPassword()+"','"+patient.getEmail()+"')";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.executeUpdate();
            System.out.println("Siamo passati da patient service impl a patinet dao impl :)");
            System.out.println("PATIENT DATA INSERTED SUCCESSFULLY! :)");
        }catch (SQLException e){
            e.printStackTrace();
        }


    }

    @Override
    public void loginPatient(String email, String password) throws SQLException {
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
                    //System.out.println("DOCTOR EMAIL: "+email);
                    //System.out.println("DOCTOR PASSWORD: "+password);
                }
            }


        }catch (SQLException e){
            e.getMessage();
        }
    }
}
