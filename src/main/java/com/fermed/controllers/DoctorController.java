package com.fermed.controllers;

import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorLoginDTO;
import com.fermed.facades.DoctorFacade;
import com.fermed.model.Doctor;
import lombok.Data;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@Data
@RestController
@RequestMapping("/doctor")  //with (/doctor) we will access the doctor controller
@CrossOrigin("*")

public class DoctorController {



   @Resource
    private DoctorFacade doctorFacade;


     //creating API to create the doctor
    @PostMapping(value = "/createDoctor")
    public void createDoctor(@Valid @RequestBody DoctorDTO doctorDTO) throws Exception {
       doctorFacade.createDoctor(doctorDTO);
    }


        //creating API  TO GET DOCTOR BY EMAIL AND PASSWORD

        @PostMapping(path = "/doctorLogin", produces = MediaType.APPLICATION_JSON_VALUE)
        public Doctor loginDoctor(@Valid @RequestBody DoctorLoginDTO doctorLoginDTO) throws Exception {
        return doctorFacade.loginDoctor(doctorLoginDTO);
        }



    //by this API we get
    @GetMapping(path = "/getDoctorDetails" , produces = MediaType.APPLICATION_JSON_VALUE)
    public void doctorData(@RequestBody DoctorDTO doctorDTO) throws Exception {
        doctorFacade.doctorData(doctorDTO);
    }





}
