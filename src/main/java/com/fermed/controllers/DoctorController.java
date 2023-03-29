package com.fermed.controllers;

import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorLoginDTO;
import com.fermed.facades.DoctorFacade;
import com.fermed.model.Doctor;
import com.fermed.response.LoginResponse;
import lombok.Data;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@Data
@RestController
@RequestMapping("/doctor")  //with (/doctor) we will access the doctor controller
@CrossOrigin("*")
@ComponentScan({"com.fermed.controllers", "com.fermed.facade", "com.fermed.repository"})
public class DoctorController {



   @Resource
    private DoctorFacade doctorFacade;


    //creating API to create the doctor
    @PostMapping(value = "/createDoctor")
    public void createDoctor(@Valid @RequestBody DoctorDTO doctorDTO) throws Exception {
       doctorFacade.createDoctor(doctorDTO);
    }


    //creating API  TO GET DOCTOR BY EMAIL AND PASSWORD
        @GetMapping(path = "/doctorLogin")
    public void loginDoctor(@Valid @RequestBody DoctorLoginDTO doctorLoginDTO) throws Exception {
        doctorFacade.loginDoctor(doctorLoginDTO);


        }








}
