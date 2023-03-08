package com.fermed.controllers;

import com.fermed.facades.DoctorFacade;
import com.fermed.services.DoctorService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Data
@RestController
@RequestMapping("/") //with (/) we will access the home controller
public class HomeController {


    private DoctorFacade doctorFacade;


    //Spring boot REST API

    @PostMapping
        public ResponseEntity<DoctorDTO> createDoctor(@RequestBody DoctorDTO doctorDTO){
        DoctorDTO savedDoctor = doctorFacade.createDoctor(doctorDTO);
        return new ResponseEntity<>(savedDoctor, HttpStatus.CREATED);
    }

    //Spring Boot REST API a Doctor
    @GetMapping("/doctor")
    public ResponseEntity<DoctorDTO> getDoctor(){
        DoctorDTO doctorDTO = doctorFacade.getDoctorDTO();
        return new ResponseEntity<>(doctorDTO, HttpStatus.OK);
    }



    }

