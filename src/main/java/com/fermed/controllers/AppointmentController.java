package com.fermed.controllers;

import com.fermed.DTO.AppointmentDTO;
import com.fermed.DTO.PatientDTO;
import com.fermed.exception.ResourceNotFoundException;
import com.fermed.facades.AppointmentFacade;
import com.fermed.model.Appointment;
import com.fermed.repository.AppointmentRepository;
import org.apache.coyote.Response;
import org.apache.logging.log4j.spi.ObjectThreadContextMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/appointment")
@CrossOrigin("*")
public class AppointmentController {


    @Resource
    private AppointmentFacade appointmentFacade;



    private AppointmentRepository appointmentRepository; //this is giving me null





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

/*
    //UPDATE APPOINTMENT
    @PutMapping("/updateAppointment/{id_appuntamento}")
    public ResponseEntity<Appointment> updateAppointment(@PathVariable Integer id_appuntamento, Appointment appointmentDetails){
        Appointment appointment = appointmentRepository.findById(id_appuntamento)
                .orElseThrow(() -> new ResourceNotFoundException("Appointment not exist with this id: " + id_appuntamento));
        appointment.setTime_date(appointmentDetails.getTime_date());
        appointment.setPayment(appointmentDetails.getPayment());
        Appointment updatedAppointment  = appointmentRepository.save(appointment);
        return ResponseEntity.ok(updatedAppointment);
    }
*/



}


