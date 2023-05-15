package com.fermed.controllers;

import com.fermed.DTO.DoctorDTO;
import com.fermed.facades.HomeFacade;

import com.fermed.model.Doctor;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;



@RestController
@RequestMapping("/home") //with (/home) we will access the home controller
@CrossOrigin("*")
public class HomeController {

    @Resource
    private HomeFacade homeFacade;



    //creating API to return  the doctor list
    @GetMapping("/")
    public List<DoctorDTO> getAllDoctors(){
        return this.homeFacade.getAllDoctors();
    }




    }

