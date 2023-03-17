package com.fermed.controllers;

import com.fermed.DTO.DoctorDTO;
import com.fermed.facades.DoctorFacade;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@Data
@RestController
@RequestMapping("/doctor")
public class DoctorController {



   @Resource
    private DoctorFacade doctorFacade;


@PostMapping(value = "/createDoctor")
    public void createDoctor(@Valid @RequestBody DoctorDTO doctorDTO) throws Exception {
        doctorFacade.createDoctor(doctorDTO);
    }
}
