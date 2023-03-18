package com.fermed.controllers;

import com.fermed.DTO.DoctorDTO;
import com.fermed.facades.DoctorFacade;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@Data
@RestController
@RequestMapping("/doctor")  //with (/doctor) we will access the doctor controller
public class DoctorController {



   @Resource
    private DoctorFacade doctorFacade;


    //creating API to create the doctor
    @PostMapping(value = "/createDoctor")
    public DoctorDTO createDoctor(@Valid @RequestBody DoctorDTO doctorDTO) throws Exception {
        return  doctorFacade.createDoctor(doctorDTO); }
}
