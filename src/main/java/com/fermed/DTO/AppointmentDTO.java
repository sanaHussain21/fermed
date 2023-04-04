package com.fermed.DTO;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
public class AppointmentDTO {

    private int id_appointment;

    @NotEmpty
    @NotBlank(message = "Must select a date!!!")
    private Date time_date;

    //chiedere
    private int payment;

    private int patient_id;
    private  int ID_DOC;


    private boolean IsBeingNotified;
    private boolean NotifiedByEmail;
    private  boolean NotifiedBySMS;


}
