package com.fermed.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;

import java.time.format.DateTimeFormatter;
import java.util.Date;


@Entity
@Data
public class Appointment {
    //appointment entity, using lombol

    int id_appuntamento;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    Date time_date;
     int payment;
     int patient_id;
     int ID_DOC;
     boolean IsBeingNotified;
     boolean NotifiedByEmail;
     boolean NotifiedBySMS;



}
