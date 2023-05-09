package com.fermed.facades.impl;

import com.fermed.DTO.AppointmentDTO;
import com.fermed.DTO.AppointmentData;
import com.fermed.facades.AppointmentFacade;
import com.fermed.services.AppointmentService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Component
public class AppointmentFacadeImpl implements AppointmentFacade {

    @Resource
    private AppointmentService appointmentService;


    //System.out.println(stringDate);

    //converting DTO to data
    @Override
    public void createAppointment(AppointmentDTO appointmentDTO) throws Exception {

        //CONVERSION FROM String date to localdate
        // then converted from localdate to timeStamp to save in databse


        //Format simpleformatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");

        Format simpleformatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String dateConvertedIntoString = simpleformatter.format(appointmentDTO.getTime_date());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm", Locale.ENGLISH);
        LocalDateTime date = LocalDateTime.parse(dateConvertedIntoString, formatter);


        String str = "56";
        int val = Integer.parseInt(str);

        AppointmentData appointmentData = new AppointmentData();
        appointmentData.setTime_date(date);
        appointmentData.setPayment(appointmentDTO.getPayment());
        appointmentData.setPatient_id(val);
        appointmentData.setId_doc(appointmentDTO.getId_doc());
        appointmentData.setBeingNotified(appointmentDTO.isBeingNotified());
        appointmentData.setNotifiedByEmail(appointmentDTO.isNotifiedByEmail());
        appointmentData.setNotifiedBySMS(appointmentDTO.isNotifiedBySMS());
        appointmentService.createAppointment(appointmentData);
    }


}
