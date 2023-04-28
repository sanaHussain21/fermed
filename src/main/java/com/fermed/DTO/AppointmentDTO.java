package com.fermed.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.sql.Date;

@Data
public class AppointmentDTO {
 //creating the appointmentDTO to transfer the data
    private int id_appointment;



    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date time_date;







    private int payment;



    private int patient_id;



    private  int ID_DOC;


    //will create a radio button
    private boolean IsBeingNotified;
    private boolean NotifiedByEmail;
    private  boolean NotifiedBySMS;


}
