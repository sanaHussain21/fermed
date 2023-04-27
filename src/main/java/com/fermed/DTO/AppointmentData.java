package com.fermed.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class AppointmentData {
    private int id_appointment;

    private Date time_date;

    private int payment;

    private int patient_id;

    private  int ID_DOC;

    private boolean IsBeingNotified;
    private boolean NotifiedByEmail;
    private  boolean NotifiedBySMS;
}
