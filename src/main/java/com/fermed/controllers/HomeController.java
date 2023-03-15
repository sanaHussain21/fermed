package com.fermed.controllers;

import com.fermed.facades.HomeFacade;
import com.fermed.model.Doctor;
import com.fermed.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/doctor") //with (/) we will access the home controller
public class HomeController {




    private HomeFacade homeFacade;

    @Autowired
private HomeService homeService;


    //creating API to return  the doctor list
    @GetMapping("/")
    public ResponseEntity<List<Doctor>> getAllDoctors(){
        return ResponseEntity.ok(this.homeService.getAllDoctors());
    }




    }

