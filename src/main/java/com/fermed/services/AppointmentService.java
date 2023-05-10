package com.fermed.services;

import com.fermed.DTO.AppointmentDTO;
import com.fermed.DTO.AppointmentData;

import java.sql.SQLException;
import java.util.List;

public interface AppointmentService {
    //creating appointment for the patient
    void createAppointment(AppointmentData appointmentData) throws Exception;

    List<AppointmentDTO> getAppointmentData() throws Exception;
}
