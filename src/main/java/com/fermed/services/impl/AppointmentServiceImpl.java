package com.fermed.services.impl;

import com.fermed.DAO.AppointmentDAO;
import com.fermed.DTO.AppointmentData;
import com.fermed.model.Appointment;
import com.fermed.services.AppointmentService;

import javax.annotation.Resource;
import java.sql.SQLException;

public class AppointmentServiceImpl implements AppointmentService {

    @Resource
    private AppointmentDAO appointmentDAO;

    @Override
    public void createAppointment(AppointmentData appointmentData) throws Exception {
        //conversion from DATA-> MODEL
        Appointment appointment = new Appointment();
        appointment.setTime_date(appointmentData.getTime_date());
        appointment.setPayment(appointmentData.getPayment());
        appointment.setPatient_id(appointmentData.getPatient_id());
        appointment.setID_DOC(appointmentData.getID_DOC());
        appointment.setIsBeingNotified(appointmentData.isIsBeingNotified());
        appointment.setNotifiedByEmail(appointmentData.isNotifiedByEmail());
        appointment.setNotifiedBySMS(appointmentData.isNotifiedBySMS());
        appointmentDAO.createAppointment(appointment);
    }
}
