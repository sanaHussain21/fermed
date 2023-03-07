package com.fermed.controllers;

import com.fermed.facades.DoctorFaced;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Data
@RestController
@RequestMapping("/") //with (/) we will access the home controller
public class HomeController {

    private DoctorFaced doctorFaced;
    //Spring boot REST API
    @GetMapping
    public ResponseEntity<DoctorDTO> createDoctor(@RequestBody DoctorDTO doctor){
        DoctorDTO savedDoctor = doctorFaced.createDoctor(doctor);
        return new ResponseEntity<>(savedDoctor, HttpStatus.CREATED);
    }

    //Spring Boot REST API a Doctor
    @GetMapping("/doctor")
    public ResponseEntity<DoctorDTO> getUDoctor(){
        DoctorDTO doctor = doctorFaced.getDoctor();
        return new ResponseEntity<>(doctor, HttpStatus.OK);
    }



    }

