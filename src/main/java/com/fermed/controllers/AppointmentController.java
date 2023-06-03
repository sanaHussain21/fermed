package com.fermed.controllers;

import com.fermed.DTO.AppointmentDTO;
import com.fermed.DTO.PatientDTO;
import com.fermed.facades.AppointmentFacade;
import com.fermed.model.Appointment;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/appointment")
//@CrossOrigin(origins = "*")
@CrossOrigin(origins = "http://localhost:4200")
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

/*
    @PutMapping("/updateAppointment/{id_appointment}")
    public ResponseEntity<AppointmentDTO> updateAppointmentById(@PathVariable Integer id_appointment, @RequestBody AppointmentDTO appointmentDTO){
        AppointmentDTO getAppointment = appointmentRepository.getById(id_appointment); //appointmentRepository is giving me null :(
       getAppointment.setTime_date(appointmentDTO.getTime_date());
       getAppointment.setPayment(appointmentDTO.getPayment());
       AppointmentDTO updatedAppointment = appointmentRepository.save(getAppointment);
       return ResponseEntity.ok().body(updatedAppointment);
    }
*/

//TESTING
    @PutMapping(path = "/updateAppointment")
    public void updateAppointment(@RequestBody AppointmentDTO appointmentDTO) {
    appointmentFacade.updateAppointment(appointmentDTO);
    }


    //GETTING SINGLE APPOINTMENT BY ID
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getAppointmentById/{id_appuntamento}")
    public Appointment getAppointmentById(AppointmentDTO appointmentDTO) {
        return appointmentFacade.getAppointmentById(appointmentDTO);
    }

   }


