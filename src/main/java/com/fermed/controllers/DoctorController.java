package com.fermed.controllers;

import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorLoginDTO;
import com.fermed.facades.DoctorFacade;
import com.fermed.model.Doctor;
import com.fermed.response.LoginResponse;
import com.fermed.services.impl.DoctorDetailsServiceImpl;
import lombok.Data;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.security.Principal;

@Data
@RestController
@RequestMapping("/doctor")  //with (/doctor) we will access the doctor controller
@CrossOrigin("*")

public class DoctorController {



   @Resource
    private DoctorFacade doctorFacade;

   @Resource
   private DoctorDetailsServiceImpl userDetailsService;

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

        //creating API  To get doctor by username

    @GetMapping("/current-user")
    public Doctor getCurrentUser(Principal principal)
    {
        return	((Doctor) this.userDetailsService.loadUserByUsername(principal.getName()));
    }


}
