package com.fermed.services;

import com.fermed.DTO.AppointmentDTO;
import com.fermed.DTO.AppointmentData;
import com.fermed.DTO.PatientDTO;
import com.fermed.model.Appointment;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public interface AppointmentService {
    //creating appointment for the patient
    void createAppointment(AppointmentData appointmentData) throws Exception;

    List<AppointmentDTO> getAllAppointments() throws Exception;

    List<PatientDTO> getAllPatientsList();

    //Set<AppointmentDTO> getAppointments() throws Exception;
}
