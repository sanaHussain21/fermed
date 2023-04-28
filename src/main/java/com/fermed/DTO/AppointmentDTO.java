package com.fermed.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.sql.Date;

@Data
public class AppointmentDTO {
 //creating the appointmentDTO to transfer the data
     int id_appointment;

   @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
     Date time_date;

     int payment;
     int patient_id;
      int ID_DOC;
    //will create a radio button
     boolean IsBeingNotified;
     boolean NotifiedByEmail;
    boolean NotifiedBySMS;


}
