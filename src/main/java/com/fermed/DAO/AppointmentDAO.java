package com.fermed.DAO;

import com.fermed.model.Appointment;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public interface AppointmentDAO {
    //creating the appointment for patient
     void createAppointment(Appointment appointment) throws SQLException;
}