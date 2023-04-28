package com.fermed.controllers;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fermed.DTO.AppointmentDTO;
import com.fermed.facades.AppointmentFacade;
import lombok.Data;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;


@Data
@RestController
@RequestMapping("/appointment")
@CrossOrigin("*")
public class AppointmentController {



    @Resource
    private AppointmentFacade appointmentFacade;



    //this post mapping is needed to create the appointment
    @PostMapping(path = "/createAppointment", consumes = MediaType.APPLICATION_JSON_VALUE)

    public void createAppointment(@Valid @RequestBody AppointmentDTO appointmentDTO) throws Exception {
        appointmentFacade.createAppointment(appointmentDTO);
    }


}
