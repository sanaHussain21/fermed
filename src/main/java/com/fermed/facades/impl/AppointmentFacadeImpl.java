package com.fermed.facades.impl;

import com.fermed.DTO.AppointmentDTO;
import com.fermed.DTO.AppointmentData;
import com.fermed.DTO.PatientDTO;
import com.fermed.facades.AppointmentFacade;
import com.fermed.model.Appointment;
import com.fermed.services.AppointmentService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

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

        /*
        Format simpleformatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateConvertedIntoString = simpleformatter.format(appointmentDTO.getTime_date()); //something over here stop the creation of the appointment from front-end

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm", Locale.ENGLISH);
        LocalDateTime date = LocalDateTime.parse(dateConvertedIntoString, formatter);
*/

        //String str = "56";
        //int val = Integer.parseInt(str);

        AppointmentData appointmentData = new AppointmentData();
        //appointmentData.setTime_date(date);
        appointmentData.setTime_date(appointmentDTO.getTime_date());
        appointmentData.setPayment(appointmentDTO.getPayment());
        appointmentData.setPatient_id(appointmentDTO.getPatient_id());
        appointmentData.setId_doc(appointmentDTO.getId_doc());
        appointmentData.setBeingNotified(appointmentDTO.isBeingNotified());
        appointmentData.setNotifiedByEmail(appointmentDTO.isNotifiedByEmail());
        appointmentData.setNotifiedBySMS(appointmentDTO.isNotifiedBySMS());

        appointmentService.createAppointment(appointmentData);
    }

    @Override
    public List<AppointmentDTO> getAllAppointments() throws Exception {
        return appointmentService.getAllAppointments();
    }

    @Override
    public List<PatientDTO> getAllPatientsList() {
        return appointmentService.getAllPatientsList();
    }




    @Override
    public Appointment updateAppointment(int id_appuntamento, AppointmentDTO appointmentDTO) {
        AppointmentData appointmentData1 = new AppointmentData();
        appointmentData1.setId_appuntamento(id_appuntamento);
        appointmentData1.setTime_date(appointmentDTO.getTime_date());
        appointmentData1.setPayment(appointmentDTO.getPayment());
        return appointmentService.updateAppointment(id_appuntamento, appointmentData1);
    }

    @Override
    public Appointment getAppointmentById(AppointmentDTO appointmentDTO) {
        AppointmentData appointmentData = new AppointmentData();
        appointmentData.setId_appuntamento(appointmentDTO.getId_appuntamento());
        appointmentData.setTime_date(appointmentDTO.getTime_date());
        appointmentData.setPayment(appointmentDTO.getPayment());
        appointmentData.setPatient_id(appointmentDTO.getPatient_id());
        appointmentData.setId_doc(appointmentDTO.getId_doc());
        return appointmentService.getAppointmentById(appointmentData);
    }

    @Override
    public void deleteAppointmentById(int id_appuntamento) {
        appointmentService.deleteAppointmentById(id_appuntamento);
    }


}

