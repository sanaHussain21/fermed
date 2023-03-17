package com.fermed.controllers;

import com.fermed.DTO.DoctorDTO;
import com.fermed.facades.DoctorFacade;
import com.fermed.services.DoctorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Resource
    private DoctorService doctorService;

    @Resource
    private DoctorFacade doctorFacade;


@PostMapping(value = "/createDoctor")
    public void createDoctor(@Valid @RequestBody DoctorDTO doctor) throws Exception {
        doctorFacade.createDoctor(doctor);
    }
}
