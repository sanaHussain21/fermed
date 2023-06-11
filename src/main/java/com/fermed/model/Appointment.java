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
    String time_date;
    String payment;
    int patient_id;
    int id_doc;
    boolean isBeingNotified;
    boolean notifiedByEmail;
    boolean notifiedBySMS;
    String status;


}


