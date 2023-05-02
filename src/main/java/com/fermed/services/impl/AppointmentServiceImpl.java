package com.fermed.services.impl;

import com.fermed.DAO.AppointmentDAO;
import com.fermed.DTO.AppointmentData;
import com.fermed.model.Appointment;
import com.fermed.services.AppointmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Resource
    private AppointmentDAO appointmentDAO;

    @Override
    public void createAppointment(AppointmentData appointmentData) throws Exception {
        //conversion from DATA-> MODEL
        Appointment appointment = new Appointment();

        appointment.setTime_date(Timestamp.valueOf(appointmentData.getTime_date()));
        appointment.setPayment(appointmentData.getPayment());
        appointment.setPatient_id(appointmentData.getPatient_id());
        appointment.setId_doc(appointmentData.getId_doc());
        appointment.setBeingNotified(appointmentData.isBeingNotified());
        appointment.setNotifiedByEmail(appointmentData.isNotifiedByEmail());
        appointment.setNotifiedBySMS(appointmentData.isNotifiedBySMS());
        appointmentDAO.createAppointment(appointment);
    }
}
