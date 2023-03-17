package com.fermed.controllers;

import com.fermed.DTO.DoctorDTO;
import com.fermed.facades.HomeFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;



@RestController
@RequestMapping("/home") //with (/home) we will access the home controller
public class HomeController {

    @Resource
    private HomeFacade homeFacade;



    //creating API to return  the doctor list
    @GetMapping("/")
    public ResponseEntity<List<DoctorDTO>> getAllDoctors(){
        return ResponseEntity.ok(this.homeFacade.getAllDoctors());
    }














    /*
    //getting doctor by it's id
  @RequestMapping(value = "/{id_doctor}", method =RequestMethod.GET)
   public Optional<Doctor> getDoctorById(@PathVariable("id_doctor") Integer id_doctor)
  {
      return this.homeService.getDoctorById(id_doctor);
  }
*/
    }

