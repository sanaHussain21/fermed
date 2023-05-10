package com.fermed.facades;

import com.fermed.DTO.AppointmentDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AppointmentFacade {
    //creating appointment for patient
    void createAppointment(AppointmentDTO appointmentDTO) throws Exception;

    List<AppointmentDTO> getAppointmentData();
}
