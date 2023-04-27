package com.fermed.DTO;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AppointmentData {
    private int id_appointment;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    private Date time_date;

    private int payment;

    private int patient_id;

    private  int ID_DOC;

    private boolean IsBeingNotified;
    private boolean NotifiedByEmail;
    private  boolean NotifiedBySMS;
}
