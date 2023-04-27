package com.fermed.facades;

import com.fermed.DTO.AppointmentDTO;
import org.springframework.stereotype.Component;

@Component
public interface AppointmentFacade {
    //creating appointment for patient
    void createAppointment(AppointmentDTO appointmentDTO) throws Exception;
}
