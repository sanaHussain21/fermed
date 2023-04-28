package com.fermed.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;


@Data
public class AppointmentData {
    private int id_appointment;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date time_date;



    private int payment;

    private int patient_id;

    private  int ID_DOC;

    private boolean IsBeingNotified;
    private boolean NotifiedByEmail;
    private  boolean NotifiedBySMS;
}
