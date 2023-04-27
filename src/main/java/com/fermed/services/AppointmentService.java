package com.fermed.services;

import com.fermed.DTO.AppointmentData;

public interface AppointmentService {
    //creating appointment for the patient
    void createAppointment(AppointmentData appointmentData);
}
