package com.fermed.controllers;

import com.fermed.DTO.AppointmentDTO;
import com.fermed.DTO.PatientDTO;
import com.fermed.facades.AppointmentFacade;
import org.apache.logging.log4j.spi.ObjectThreadContextMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/appointment")
@CrossOrigin("*")
public class AppointmentController {


    @Resource
    private AppointmentFacade appointmentFacade;


    //this post mapping is needed to create the appointment
    // @PostMapping(path = "/createAppointment", consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(path = "/createAppointment")

    public void createAppointment(@Valid @RequestBody AppointmentDTO appointmentDTO) throws Exception {


        appointmentFacade.createAppointment(appointmentDTO);
        //HttpSession session  = request.getSession();
        //session.setAttribute("patientName", appointmentDTO);
        //to be checked
    }


    //API to return list of appointment present in DB
    @GetMapping(value = "/")
    public List<AppointmentDTO> getAllAppointments() throws Exception {
        return this.appointmentFacade.getAllAppointments();
    }


     //Getting all patients
    @GetMapping("/getAllPatientsList")
    public List<PatientDTO> getAllPatientsList() {
        return appointmentFacade.getAllPatientsList();
    }




}


