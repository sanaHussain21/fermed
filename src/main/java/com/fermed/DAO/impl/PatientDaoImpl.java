package com.fermed.DAO.impl;

import com.fermed.DAO.DatabaseDAO;
import com.fermed.DAO.PatientDAO;
import com.fermed.DTO.PatientDTO;
import com.fermed.model.Patient;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class PatientDaoImpl implements PatientDAO {


    Connection connection;
    public PatientDaoImpl() throws SQLException
    {
        connection = DatabaseDAO.getConnection();
    }


    @Override
    public void createPatient(Patient patient) throws SQLException {

        Connection connection;
        connection =  DatabaseDAO.getConnection();

        String insertQuery = "INSERT INTO patient(name, surname, codice_fiscale , id_insurance ,telephone_number , username, password, email)" +
                "VALUES('"+patient.getName()+"','"+patient.getSurname()+"',  '"+patient.getCodice_fiscale()+"', '"+patient.getId_insurance()+"', '"+patient.getTelephone_number()+"', '"+patient.getUsername()+"','"+patient.getPassword()+"','"+patient.getEmail()+"')";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.executeUpdate();
            System.out.println("PATIENT DATA INSERTED SUCCESSFULLY! :)");
        }catch (SQLException e){
            e.printStackTrace();
        }


    }

    @Override
    public void loginPatient(String email, String password) throws SQLException {
        Connection connection;
        connection =  DatabaseDAO.getConnection();


                try{
                    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM patient WHERE email = '"+email+"' AND password = '"+password+"' ");
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while(resultSet.next()){
                        if (resultSet.getString(9).equals(email) && resultSet.getString(8).equals(password)){
                            System.out.println("Patient LOGIN SUCCESSFULLY!!");
                            System.out.println("Patient EMAIL: "+email);
                            System.out.println("Patient PASSWORD: "+password);
                        }else {
                            System.out.println("Patient LOGIN FAILED!!!");

                        }
            }


        }catch (SQLException e){
            e.getMessage();
        }
    }

    //SELECT patient.name, patient.surname, patient.codice_fiscale, patient.telephone_number, patient.username, patient.email FROM patient WHERE patient.id_patient = ''

    @Override
    public void getSinglePatient(PatientDTO patientDTO, int id_patient) {
        try {


            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id_patient, name, surname, codice_fiscale, telephone_number, username, email FROM patient WHERE patient.id_patient = '"+id_patient+"' ");
            ResultSet resultSet = preparedStatement.executeQuery();


            while(resultSet.next()){
                PatientDTO patientDTO1 = new PatientDTO();
                patientDTO1.setId_patient(resultSet.getInt(1));
                patientDTO1.setName(resultSet.getString(2));
                patientDTO1.setSurname(resultSet.getString(3));
                patientDTO1.setCodice_fiscale(resultSet.getString(4));
                patientDTO1.setTelephone_number(resultSet.getString(5));
                patientDTO1.setUsername(resultSet.getString(6));
                patientDTO1.setEmail(resultSet.getString(7));
                //System.out.println("Patient By ID data is: "+ patientDTO1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
