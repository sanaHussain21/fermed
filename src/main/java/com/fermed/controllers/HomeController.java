package com.fermed.controllers;

import com.fermed.DTO.DoctorDTO;
import com.fermed.facades.DoctorFacade;
import com.fermed.model.Doctor;
import com.fermed.services.DoctorService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;


@RestController
@RequestMapping("/") //with (/) we will access the home controller
public class HomeController {


    private DoctorFacade doctorFacade;

    @Autowired
    private DoctorService doctorService;

    //Spring boot REST API

    @PostMapping("/")
        public ResponseEntity<DoctorDTO> createDoctor(@RequestBody DoctorDTO doctor){
        DoctorDTO savedDoctor = doctorFacade.createDoctor(doctor);
        return new ResponseEntity<>(savedDoctor, HttpStatus.CREATED);
    }

    //Spring Boot REST API a Doctor
    @GetMapping("/doctorById")
    public ResponseEntity<DoctorDTO> getDoctorById(@PathVariable("") Integer id_doctor){
        DoctorDTO doctor = doctorFacade.getDoctorById(id_doctor); //talking with facade
            return new ResponseEntity<>(doctor, HttpStatus.OK);
    }

        //creating API to return  the doctor list
        @GetMapping("/doctorData")
        public List<DoctorDTO> getAllDoctors(){
        return this.doctorService.getAllDoctors();
        }

    }

