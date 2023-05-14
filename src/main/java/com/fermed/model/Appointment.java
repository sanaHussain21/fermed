package com.fermed.model;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Data
public class Appointment {
    //appointment entity, using lombok

    int id_appuntamento;

    //testing  Date time_date;
    String time_date;

    int payment;
    int patient_id;
    int id_doc;
    boolean isBeingNotified;
    boolean notifiedByEmail;
    boolean notifiedBySMS;


}


