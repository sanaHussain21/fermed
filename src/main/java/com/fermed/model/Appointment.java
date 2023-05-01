package com.fermed.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;

import java.sql.Time;
import java.time.format.DateTimeFormatter;
import java.util.Date;


@Entity
@Data
public class Appointment {
    //appointment entity, using lombol

    int id_appuntamento;

    //@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", shape = JsonFormat.Shape.STRING)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    Date time_date;
    int payment;
    int patient_id;
    int id_doc;
    boolean isBeingNotified;
    boolean notifiedByEmail;
    boolean notifiedBySMS;


}


