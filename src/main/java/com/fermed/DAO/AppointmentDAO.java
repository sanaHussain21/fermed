package com.fermed.DAO;

import com.fermed.DTO.AppointmentDTO;
import com.fermed.DTO.PatientDTO;
import com.fermed.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

@Component
public interface AppointmentDAO{
    //creating the appointment for patient
     void createAppointment(Appointment appointment) throws SQLException;

    List<AppointmentDTO> getAllAppointments() throws SQLException;

    List<PatientDTO> getAllPatientsList();

    



}
