package com.fermed.services.impl;

import com.fermed.DAO.DatabaseDAO;
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
    public void createPatient(Patient patient) throws Exception {
            String name = patient.getName();
            String surname = patient.getSurname();
            String codice_fiscale = patient.getCodice_fiscale();
            int id_insurance = patient.getId_insurance();
            String telephone_number = patient.getTelephone_number();
            String username = patient.getUsername();
            String password = patient.getPassword();
            String email = patient.getEmail();


        String insertQuery = "INSERT INTO patient(name, surname, codice_fiscale , id_insurance ,telephone_number , username, password, email)" +
                "VALUES('"+name+"','"+surname+"',  '"+codice_fiscale+"', '"+id_insurance+"', '"+telephone_number+"', '"+username+"','"+password+"','"+email+"')";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.executeUpdate();
            System.out.println("PATIENT DATA INSERTED SUCCESSFULLY!");
        }catch (SQLException e){
            e.printStackTrace();
        }
            //fare controllo se un utente is already in the database or not
    }
}
