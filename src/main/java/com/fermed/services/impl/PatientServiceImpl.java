package com.fermed.services.impl;

import com.fermed.DAO.DatabaseDAO;
import com.fermed.DTO.PatientData;
import com.fermed.model.Patient;
import com.fermed.services.PatientService;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class PatientServiceImpl implements PatientService {

    Connection connection;

    public PatientServiceImpl() throws SQLException {
        connection =  DatabaseDAO.getConnection();
    }


    @Override
    public void createPatient(PatientData patientData) {
        //converion from data -> model
            Patient patient = new Patient();
        patient.setName(patientData.getName());
        patient.setSurname(patientData.getSurname());
        patient.setCodice_fiscale(patientData.getCodice_fiscale());
        patient.setId_insurance(patientData.getId_insurance());
        patient.setTelephone_number(patientData.getTelephone_number());
        patient.setUsername(patientData.getUsername());
        patient.setPassword(patientData.getPassword());
        patient.setUsername(patientData.getUsername());



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
}
