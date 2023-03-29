package com.fermed.controllers;

import com.fermed.DTO.DoctorDTO;
import com.fermed.facades.HomeFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;



@RestController
@RequestMapping("/home") //with (/home) we will access the home controller
@CrossOrigin("*")
public class HomeController {

    @Resource
    private HomeFacade homeFacade;


    /*
    *   @GetMapping("/")
    public ResponseEntity<List<DoctorDTO>> getAllDoctors(){
        return ResponseEntity.ok(this.homeFacade.getAllDoctors());
    }
    * */

    //creating API to return  the doctor list
    @GetMapping("/")
    public List<DoctorDTO> getAllDoctors(){
        return this.homeFacade.getAllDoctors();
    }

    }

