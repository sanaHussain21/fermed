package com.fermed.DTO;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
public class AppointmentDTO {
 //creating the appointmentDTO to transfer the data
    private int id_appointment;

    @NotEmpty
    @NotBlank(message = "time_date must be selected!!!")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    private Date time_date;


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
