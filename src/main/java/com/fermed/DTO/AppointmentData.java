package com.fermed.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;


@Data
public class AppointmentData {
    int id_appuntamento;

    //@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", shape = JsonFormat.Shape.STRING)
    @JsonFormat(pattern="dd-MM-YYYY HH:mm")
    Date time_date;
    int payment;
    int patient_id;
    int id_doc;
    boolean isBeingNotified;
    boolean notifiedByEmail;
    boolean notifiedBySMS;
}
