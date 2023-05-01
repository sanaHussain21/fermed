package com.fermed.facades.impl;

import com.fermed.DTO.AppointmentDTO;
import com.fermed.DTO.AppointmentData;
import com.fermed.facades.AppointmentFacade;
import com.fermed.services.AppointmentService;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AppointmentFacadeImpl implements AppointmentFacade {

    @Resource
    private AppointmentService appointmentService;

    //creating isBeingNotified method









    //converting DTO to data
    @Override
    public void createAppointment(AppointmentDTO appointmentDTO) throws Exception {
        AppointmentData appointmentData = new AppointmentData();

        appointmentData.setTime_date(appointmentDTO.getTime_date());
        appointmentData.setPayment(appointmentDTO.getPayment());
        appointmentData.setPatient_id(appointmentDTO.getPatient_id());
        appointmentData.setId_doc(appointmentDTO.getId_doc());
        appointmentData.setBeingNotified(appointmentDTO.isBeingNotified());
        appointmentData.setNotifiedByEmail(appointmentDTO.isNotifiedByEmail());
        appointmentData.setNotifiedBySMS(appointmentDTO.isNotifiedBySMS());
        appointmentService.createAppointment(appointmentData);
    }
}
