package com.fermed.controllers;

import com.fermed.model.Patient;
import com.fermed.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;


    @PostMapping(value = "/createPatient")
    public void createDoctor(@RequestBody Patient patient) throws Exception {
        patientService.createPatient(patient);
    }




}
