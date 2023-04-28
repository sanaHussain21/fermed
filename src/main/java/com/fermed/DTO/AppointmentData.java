package com.fermed.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


@Data
public class AppointmentData {
    private int id_appointment;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")

    private DateTimeFormat time_date;


    private int payment;

    private int patient_id;

    private  int ID_DOC;

    private boolean IsBeingNotified;
    private boolean NotifiedByEmail;
    private  boolean NotifiedBySMS;
}
