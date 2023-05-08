package com.fermed.controllers;

import com.fermed.DTO.AppointmentDTO;
import com.fermed.facades.AppointmentFacade;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;


@RestController
@RequestMapping("/appointment")
@CrossOrigin("*")
public class AppointmentController {



    @Resource
    private AppointmentFacade appointmentFacade;



    //this post mapping is needed to create the appointment
    @PostMapping(path = "/createAppointment")

    public void createAppointment(@Valid @RequestBody AppointmentDTO appointmentDTO, HttpServletRequest request) throws Exception {
        appointmentFacade.createAppointment(appointmentDTO);
        HttpSession session  = request.getSession();
        session.setAttribute("patientName", appointmentDTO);
       //to be checked
    }



}

