package com.fermed.DAO;

import com.fermed.model.Appointment;

import java.sql.SQLException;

public interface AppointmentDAO {
    //creating the appointment for patient
     void createAppointment(Appointment appointment) throws SQLException;
}
