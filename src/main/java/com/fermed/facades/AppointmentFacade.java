package com.fermed.facades;

import com.fermed.DTO.AppointmentDTO;
import org.springframework.stereotype.Component;

@Component
public interface AppointmentFacade {
    void createAppointment(AppointmentDTO appointmentDTO);
}
