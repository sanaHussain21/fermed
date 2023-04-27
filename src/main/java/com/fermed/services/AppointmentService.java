package com.fermed.services;

import com.fermed.DTO.AppointmentData;

import java.sql.SQLException;

public interface AppointmentService {
    //creating appointment for the patient
    void createAppointment(AppointmentData appointmentData) throws Exception;
}
