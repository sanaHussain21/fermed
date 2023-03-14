package com.fermed.controllers;

import com.fermed.DTO.DoctorDTO;
import com.fermed.facades.DoctorFacade;
import com.fermed.model.Doctor;
import com.fermed.services.DoctorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/doctorRegistration")
public class DoctorRegistrationController {

    private DoctorService doctorService;


    @PostMapping("/")
    //POST CREATING DOCTOR
    public ResponseEntity<Doctor> createDoctor(@RequestBody Doctor doctor) throws Exception {
        Doctor savedDoctor = this.doctorService.createDoctor(doctor);
        return new ResponseEntity<>(savedDoctor, HttpStatus.CREATED);


    }
}
