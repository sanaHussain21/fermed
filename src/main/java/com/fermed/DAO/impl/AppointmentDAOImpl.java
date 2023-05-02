package com.fermed.DAO.impl;

import com.fermed.DAO.AppointmentDAO;
import com.fermed.DAO.DatabaseDAO;
import com.fermed.model.Appointment;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class AppointmentDAOImpl implements AppointmentDAO {

    @Override
    public void createAppointment(Appointment appointment) throws SQLException {
        //connection for database
        Connection connection;
        connection = DatabaseDAO.getConnection();


/*
*    Date thisDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/Y HH:mm a");
        String stringDate = dateFormat.format(thisDate);
        java.util.Date dateStr = dateFormat.parse(date);
        java.sql.Date dateDB = new java.sql.Date(dateStr.getTime());*/


        Date thisDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/Y HH:mm a");
        String stringDate = dateFormat.format(thisDate);


        String insertQuery = "INSERT INTO appuntamento(time_date, payment, patient_id , ID_DOC , IsBeingNotified, NotifiedByEmail, NotifiedBySMS)" +
                //"VALUES('2', '2023-05-23 13:30:00', '30', '55' , '39', true, true, false)";
                "VALUES('" + appointment.getTime_date() + "', '" + appointment.getPayment() + "', " + appointment.getPatient_id() + ",  " + appointment.getId_doc() + ", " + appointment.isBeingNotified() + ",  " + appointment.isNotifiedByEmail() + " , " + appointment.isNotifiedBySMS() + ")";


        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.executeUpdate();
            System.out.println("APPOINTMENT CREATED SUCCESSFULLY! :)");
            //for testing:


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
