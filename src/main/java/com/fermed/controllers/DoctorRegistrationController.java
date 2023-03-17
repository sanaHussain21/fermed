package com.fermed.controllers;

import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorRegistrationDto;
import com.fermed.facades.DoctorFacade;
import com.fermed.model.Doctor;
import com.fermed.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.print.Doc;
import javax.validation.Valid;

@RestController
@RequestMapping("/doctor")
public class DoctorRegistrationController {

    @Resource
    private DoctorService doctorService;

    @Resource
    private DoctorFacade doctorFacade;


@PostMapping(value = "/createDoctor")
    public void createDoctor(@Valid @RequestBody DoctorDTO doctor) throws Exception {
        doctorFacade.createDoctor(doctor);
    }
}
