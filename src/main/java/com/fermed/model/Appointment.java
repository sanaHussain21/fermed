package com.fermed.model;

import lombok.Data;

import javax.persistence.Entity;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
@Data
public class Appointment {
    //appointment entity, using lombol

    int id_appuntamento;
     Date time_date;
     int payment;
     int patient_id;
     int ID_DOC;
     boolean IsBeingNotified;
     boolean NotifiedByEmail;
     boolean NotifiedBySMS;



}
