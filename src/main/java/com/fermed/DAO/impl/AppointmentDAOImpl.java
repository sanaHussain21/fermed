package com.fermed.DAO.impl;

import com.fermed.DAO.AppointmentDAO;
import com.fermed.DAO.DatabaseDAO;
import com.fermed.DTO.AppointmentDTO;
import com.fermed.DTO.PatientDTO;
import com.fermed.model.Appointment;
import com.fermed.repository.AppointmentRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@Component
public class AppointmentDAOImpl implements AppointmentDAO {

    private JdbcTemplate jdbcTemplate;
    Connection connection;

    public AppointmentDAOImpl() throws SQLException {
        connection = DatabaseDAO.getConnection();
    }

    private AppointmentRepository appointmentRepository;


    //private AppointmentRepository appointmentRepository;

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
                "VALUES('" + appointment.getTime_date() + "', '" + appointment.getPayment() + "', " + appointment.getPatient_id() + ",  " + appointment.getId_doc() + ", " + appointment.isBeingNotified() + ",  " + appointment.isNotifiedByEmail() + " , " + appointment.isNotifiedBySMS() + ")";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.executeUpdate();
            System.out.println("APPOINTMENT CREATED SUCCESSFULLY! :)");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    /*
    TO BE REPLACED IF THE PREVIOUS QUESRY DOESN'T WORK PROPER
     try {
            //SELECT patient.id_patient, patient.name, patient.surname, appuntamento.payment, appuntamento.time_date FROM patient INNER JOIN appuntamento ON patient.id_patient = appuntamento.patient_id WHERE id_patient = '56'

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id_appuntamento, time_date, payment, patient_id, ID_DOC, IsBeingNotified, NotifiedByEmail, NotifiedBySMS FROM appuntamento");
            ResultSet resultSet = preparedStatement.executeQuery();


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

     */


    @Override
    public List<AppointmentDTO> getAllAppointments() throws SQLException {
        List<AppointmentDTO> appointmentList = new ArrayList<>();
        Connection connection;
        connection = DatabaseDAO.getConnection();
        try {
            //SELECT patient.id_patient, patient.name, patient.surname, appuntamento.payment, appuntamento.time_date FROM patient INNER JOIN appuntamento ON patient.id_patient = appuntamento.patient_id WHERE id_patient = '56'

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id_appuntamento, time_date, payment, patient_id, ID_DOC, IsBeingNotified, NotifiedByEmail, NotifiedBySMS FROM appuntamento");
            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {
                AppointmentDTO appointmentDTO = new AppointmentDTO();
                appointmentDTO.setId_appuntamento(resultSet.getInt(1));
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

    @Override
    public List<PatientDTO> getAllPatientsList() {
        List<PatientDTO> patientsList = new ArrayList<>();
        try {
            //SELECT id_patient, name, surname, codice_fiscale, id_insurance, telephone_number, username, password, email FROM patient

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id_patient, name, surname, codice_fiscale, id_insurance, telephone_number, username, password, email FROM patient");
            ResultSet resultSet = preparedStatement.executeQuery();

            //it will read one by one all raws from the doctor's table
            while (resultSet.next()) {
                PatientDTO patientDTO = new PatientDTO();
                patientDTO.setId_patient(resultSet.getInt(1));
                patientDTO.setName(resultSet.getString(2));
                patientDTO.setSurname(resultSet.getString(3));
                patientDTO.setCodice_fiscale(resultSet.getString(4));
                patientDTO.setId_insurance(resultSet.getInt(5));
                patientDTO.setTelephone_number(resultSet.getString(6));
                patientDTO.setUsername(resultSet.getString(7));
                patientDTO.setPassword(resultSet.getString(8));
                patientDTO.setEmail(resultSet.getString(9));
                patientsList.add(patientDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patientsList;
    }

    /*   //my code
    @Override
    public Appointment updateAppointment(Appointment appointment) {
        String updateQuery = "UPDATE  appuntamento " +
                "SET time_date = '" + appointment.getTime_date() + "', payment= '" + appointment.getPayment() + "' " +
                "WHERE id_appuntamento = " + appointment.getId_appuntamento();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("APPOINTMENT UPDATED SUCCESSFULLY! :)");
            } else {
                System.out.println("No appointment found with the provided ID : " +appointment.getId_appuntamento());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
        return  appointment;
    }

    }*/

    /* CHATGBT CODE
     @Override
    public Appointment updateAppointment(Appointment appointment) {
        String updateQuery = "UPDATE appuntamento " +
                "SET time_date = ?, payment = ? " +
                "WHERE id_appuntamento = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, appointment.getTime_date());
            preparedStatement.setString(2, appointment.getPayment());
            preparedStatement.setInt(3, appointment.getId_appuntamento());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("APPOINTMENT UPDATED SUCCESSFULLY! :)");
            } else {
                System.out.println("No appointment found with the provided ID: " + appointment.getId_appuntamento());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
        return appointment;
    }
    *
    * */


    //THIS IS WORKING PERFECTLY
    @Override
    public Appointment updateAppointment(int id_appuntamento, Appointment appointment) {
        String updateQuery = "UPDATE appuntamento " +
                "SET time_date = ?, payment = ? " +
                "WHERE id_appuntamento = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, appointment.getTime_date());
            preparedStatement.setString(2, appointment.getPayment());
            preparedStatement.setInt(3, id_appuntamento);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("APPOINTMENT UPDATED SUCCESSFULLY! :)" + id_appuntamento);
                System.out.println("time_date: " + appointment.getTime_date());
                System.out.println("payment: " + appointment.getPayment());
            } else {
                System.out.println("No appointment found with the provided ID: " + id_appuntamento);
                System.out.println("time_date: " + appointment.getTime_date());
                System.out.println("payment: " + appointment.getPayment());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
        return appointment;
    }





    @Override
    public Appointment getAppointmentById(Appointment appointment) {
        Appointment appointment1 = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id_appuntamento, time_date, payment, patient_id, ID_DOC FROM appuntamento WHERE id_appuntamento = '" + appointment.getId_appuntamento() + "' ");
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                 appointment1 = new Appointment();
                appointment1.setId_appuntamento(resultSet.getInt(1));
                appointment1.setTime_date(resultSet.getString(2));
                appointment1.setPayment(resultSet.getString(3));
                appointment1.setPatient_id(resultSet.getInt(4));
                appointment1.setId_doc(resultSet.getInt(5));


            }

            //System.out.println(resultSet.getInt(1)+", "+resultSet.getString(2)+", "+resultSet.getString(3)+", "+resultSet.getInt(4)+", "+resultSet.getInt(5));
        } catch (SQLException e) {
            e.printStackTrace();
        }

return  appointment1;
    }

    @Override
    public void deleteAppointmentById(int id_appuntamento) {
        String deleteQuery = "DELETE FROM appuntamento WHERE id_appuntamento = " + id_appuntamento;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("APPOINTMENT DELETED SUCCESSFULLY! :)"+ id_appuntamento);
            } else {
                System.out.println("No appointment has been deleted with the provided ID : " +id_appuntamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
} try {
        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
        System.out.println("APPOINTMENT DELETED SUCCESSFULLY! :)"+ id_appuntamento);
        } else {
        System.out.println("No appointment has been deleted with the provided ID : " +id_appuntamento);
        }
        } catch (SQLException e) {
        e.printStackTrace();

        }