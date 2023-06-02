package com.fermed.services;

import com.fermed.DTO.AppointmentDTO;
import com.fermed.DTO.AppointmentData;
import com.fermed.DTO.PatientDTO;
import com.fermed.model.Appointment;

import java.util.List;

public interface AppointmentService {
    //creating appointment for the patient
    void createAppointment(AppointmentData appointmentData) throws Exception;

    List<AppointmentDTO> getAllAppointments() throws Exception;

    List<PatientDTO> getAllPatientsList();


    void updateAppointment(AppointmentDTO appointmentDTO);


    Appointment getAppointmentById(AppointmentData appointmentData);
}
