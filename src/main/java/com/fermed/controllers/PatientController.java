package com.fermed.controllers;

import com.fermed.DTO.DoctorLoginDTO;
import com.fermed.DTO.PatientDTO;
import com.fermed.DTO.PatientLoginDTO;
import com.fermed.facades.PatientFacade;
import com.fermed.model.Patient;
import com.fermed.services.PatientService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@Data
@RestController
@RequestMapping("/patient")  //with (/patient) we will access the patient controller
@CrossOrigin("*")
public class PatientController {

    @Resource
    private PatientFacade patientFacade;


    @PostMapping(value = "/createPatient")
    public void createDoctor(@Valid @RequestBody PatientDTO patientDTO) throws Exception {
        patientFacade.createPatient(patientDTO);
    }

    //creating API  TO GET DOCTOR BY EMAIL AND PASSWORD
    @PostMapping(path = "/patientLogin")
    public void loginPatient(@Valid @RequestBody PatientLoginDTO patientLoginDTO) throws Exception {
        patientFacade.loginPatient(patientLoginDTO);


    }


}
