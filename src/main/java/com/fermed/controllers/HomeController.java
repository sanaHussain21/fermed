package com.fermed.controllers;

import com.fermed.DTO.ApiResponse;
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
import java.util.Map;


@RestController
@RequestMapping("/doctor") //with (/) we will access the home controller
public class HomeController {


    private DoctorFacade doctorFacade;

    @Autowired
    private DoctorService doctorService;



    //Spring boot REST API

    //POST CREATING DOCTOR
    @PostMapping("/")
        public ResponseEntity<DoctorDTO> createDoctor(@RequestBody DoctorDTO doctorDTO){
        DoctorDTO savedDoctor = this.doctorService.createDoctor(doctorDTO);
        return new ResponseEntity<>(savedDoctor, HttpStatus.CREATED);


    }

    //Spring Boot REST API a Doctor
    @GetMapping("/{id_doctor}")
    public ResponseEntity<DoctorDTO> getDoctorById(@PathVariable("") Integer id_doctor){
       return ResponseEntity.ok(this.doctorService.getDoctorById(id_doctor)); //talking with facade

    }

        //creating API to return  the doctor list
        @GetMapping("/")
        public ResponseEntity<List<Doctor>> getAllDoctors(){
        return ResponseEntity.ok(this.doctorService.getAllDoctors());
        }

        //PUT - update doctor
        @PutMapping("/{doctorId}")
        public ResponseEntity<DoctorDTO> updateDoctor(@RequestBody DoctorDTO doctorDTO, @PathVariable Integer doctorId )
        {
          DoctorDTO updatedDoctor =  this.doctorService.updateDoctor(doctorDTO, doctorId);
          return ResponseEntity.ok(updatedDoctor);
        }

        //DELETE - DELETE DOCTOR
    @DeleteMapping("/{doctorId}")
        public ResponseEntity<ApiResponse> deleteDoctor(@PathVariable("doctorId") Integer doctorId)
        {
            this.deleteDoctor(doctorId);
            ResponseEntity<?> deleteDoctor = this.deleteDoctor(doctorId);
            return new ResponseEntity<ApiResponse>(new ApiResponse("Doctor deleted Successfully", true), HttpStatus.OK);
        }






    }

