package com.fermed.DAO.impl;

import com.fermed.DAO.AppointmentDAO;
import com.fermed.DAO.DatabaseDAO;
import com.fermed.DTO.AppointmentDTO;
import com.fermed.model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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

        //Date currentDate= new Date();
       /* SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String stringDate = dateFormat.format(appointment.getTime_date());
        System.out.println("The date i have inserted from postman is : "+stringDate);
        try {
          appointment.setTime_date(dateFormat.parse(stringDate));
          System.out.println(appointment.getTime_date());
        } catch (ParseException e) {
            e.printStackTrace();
        }*/

        String insertQuery = "INSERT INTO appuntamento(time_date, payment, patient_id , ID_DOC , IsBeingNotified, NotifiedByEmail, NotifiedBySMS)" +
                //"VALUES('2', '2023-05-23 13:30:00', '30', '55' , '39', true, true, false)"
                "VALUES('" + appointment.getTime_date() + "', '"+appointment.getPayment()+"', " + appointment.getPatient_id() + ",  " + appointment.getId_doc() + ", " + appointment.isBeingNotified() + ",  " + appointment.isNotifiedByEmail() + " , " + appointment.isNotifiedBySMS() + ")";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.executeUpdate();
            System.out.println("APPOINTMENT CREATED SUCCESSFULLY! :)");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    //getting appointmrnt data
//@Autowired
    //static   List<AppointmentDTO> appointmentList = new ArrayList<>();
   List<AppointmentDTO> appointmentList = new ArrayList<>();


    @Override
    public List<AppointmentDTO> getAllAppointments() throws SQLException {
        Connection connection;
        connection = DatabaseDAO.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id_appuntamento, time_date, payment, patient_id, ID_DOC, IsBeingNotified, NotifiedByEmail, NotifiedBySMS FROM appuntamento");
            ResultSet resultSet = preparedStatement.executeQuery();

            //it will read one by one all raws from the doctor's table
            while(resultSet.next()){
                AppointmentDTO appointmentDTO = new AppointmentDTO();
                appointmentDTO.setId_appointment(resultSet.getInt(1));
                appointmentDTO.setTime_date(resultSet.getString(2));
                appointmentDTO.setPayment(resultSet.getString(3));
                appointmentDTO.setPatient_id(resultSet.getInt(4));
                appointmentDTO.setId_doc(resultSet.getInt(5));
                appointmentDTO.setBeingNotified(resultSet.getBoolean(6));
                appointmentDTO.setNotifiedByEmail(resultSet.getBoolean(7));
                appointmentDTO.setNotifiedBySMS(resultSet.getBoolean(8));
                appointmentList.add(appointmentDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointmentList;
    }


}
