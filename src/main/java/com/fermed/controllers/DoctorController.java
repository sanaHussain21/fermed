package com.fermed.controllers;

import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorLoginDTO;
import com.fermed.facades.DoctorFacade;
import lombok.Data;
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
        @PostMapping(path = "/doctorLogin")
    public void loginDoctor(@Valid @RequestBody DoctorLoginDTO doctorLoginDTO) throws Exception {
        doctorFacade.loginDoctor(doctorLoginDTO);
        }


        //testing
    @GetMapping(path = "/getDoctorDetails")
    public void doctorData(@RequestBody DoctorDTO doctorDTO) throws Exception {
        doctorFacade.doctorData(doctorDTO);
    }

  

}
