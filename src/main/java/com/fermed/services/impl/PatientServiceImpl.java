package com.fermed.services.impl;

import com.fermed.DAO.DatabaseDAO;
import com.fermed.DAO.PatientDAO;
import com.fermed.DTO.PatientData;
import com.fermed.model.Patient;
import com.fermed.services.PatientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class PatientServiceImpl implements PatientService {


    @Resource
    private PatientDAO patientDAO;

    Connection connection;

    public PatientServiceImpl() throws SQLException {
        connection = DatabaseDAO.getConnection();
    }


    @Override
    public void createPatient(PatientData patientData) throws SQLException {
        //converion from data -> model
        Patient patient = new Patient();
        patient.setName(patientData.getName());
        patient.setSurname(patientData.getSurname());
        patient.setCodice_fiscale(patientData.getCodice_fiscale());
        patient.setId_insurance(patientData.getId_insurance());
        patient.setTelephone_number(patientData.getTelephone_number());
        patient.setUsername(patientData.getUsername());
        patient.setPassword(patientData.getPassword());
        patient.setEmail(patientData.getEmail());
        patientDAO.createPatient(patient);

/*
        String insertQuery = "INSERT INTO patient(name, surname, codice_fiscale , id_insurance ,telephone_number , username, password, email)" +
                "VALUES('"+patient.getName()+"','"+patient.getSurname()+"',  '"+patient.getCodice_fiscale()+"', '"+patient.getId_insurance()+"', '"+patient.getTelephone_number()+"', '"+patient.getUsername()+"','"+patient.getPassword()+"','"+patient.getEmail()+"')";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.executeUpdate();
            System.out.println("PATIENT DATA INSERTED SUCCESSFULLY! :)");
        }catch (SQLException e){
            e.printStackTrace();
        }
*/
    }

    @Override
    public void loginPatient(String email, String password) throws SQLException {
        patientDAO.loginPatient(email, password);

    }
}
