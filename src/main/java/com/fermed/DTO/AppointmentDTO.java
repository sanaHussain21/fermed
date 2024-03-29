package com.fermed.DTO;

import com.fermed.model.Appointment;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
public class AppointmentDTO {
    //creating the appointmentDTO to transfer the data
    int id_appuntamento;

   // @Temporal(TemporalType.TIMESTAMP)
    //@JsonFormat(pattern="dd-MM-yyyy HH:mm")
    //@JsonFormat(pattern="yyyy-MM-dd HH:mm")
    //Date time_date;
   String time_date;
    String payment;
    int patient_id;

    public int getPatient_id() {
        return patient_id;
    }

    int id_doc;
    //will create a radio button
    boolean beingNotified;
    boolean notifiedByEmail;
    boolean notifiedBySMS;

    String status;
    public String getTime_date() {
        return time_date;
    }


}
