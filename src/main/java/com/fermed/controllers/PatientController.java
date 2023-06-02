package com.fermed.controllers;

import com.fermed.DTO.PatientDTO;
import com.fermed.DTO.PatientLoginDTO;
import com.fermed.facades.PatientFacade;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Data
@RestController
@RequestMapping("/patient")  //with (/patient) we will access the patient controller
@CrossOrigin(origins = "*")
public class PatientController {

    @Resource
    private PatientFacade patientFacade;


    @PostMapping(value = "/createPatient")
    public void createDoctor(@Valid @RequestBody PatientDTO patientDTO) throws Exception {
        patientFacade.createPatient(patientDTO);
    }

    //creating API  TO GET DOCTOR BY EMAIL AND PASSWORD

    @PostMapping(value = "/patientLogin")
    public void loginPatient(@Valid @RequestBody PatientLoginDTO patientLoginDTO) throws Exception {
        patientFacade.loginPatient(patientLoginDTO);
    }

    //creating API to get Single patient by its id
    @GetMapping("/getSinglePatient/{id_patient}")
    public void getSinglePatient(PatientDTO patientDTO, @PathVariable int id_patient){
        patientFacade.getSinglePatient(patientDTO,id_patient);
    }

}