package com.fermed.facades;

import com.fermed.DTO.AppointmentDTO;
import com.fermed.model.Appointment;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public interface AppointmentFacade {
    //creating appointment for patient
    void createAppointment(AppointmentDTO appointmentDTO) throws Exception;

    List<AppointmentDTO> getAppointmentData() throws Exception;

   // public Set<AppointmentDTO> getAppointments() throws Exception;
}
    //creating appointment for patient
    void createAppointment(AppointmentDTO appointmentDTO) throws Exception;

    List<AppointmentDTO> getAppointmentData() throws Exception;

// public Set<AppointmentDTO> getAppointments() throws Exception;