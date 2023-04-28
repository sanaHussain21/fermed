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

    @NotEmpty
    @NotBlank(message = "time_date must be selected!!!")

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")

    private DateTimeFormat time_date;





   @NotEmpty
    @NotBlank(message = "Payment must be inserted!!!")
    private int payment;

    @NotEmpty
    @NotBlank(message = "Patient name must be inserted!!!")
    private int patient_id;

    @NotEmpty
    @NotBlank(message = "Doctor name must be inserted!!!")
    private  int ID_DOC;


    //will create a radio button
    private boolean IsBeingNotified;
    private boolean NotifiedByEmail;
    private  boolean NotifiedBySMS;


}
