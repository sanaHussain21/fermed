package com.fermed.controllers;

import com.fermed.DTO.TypeOfDoctorDTO;
import com.fermed.facades.TypeOfDoctorFacade;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/typeOfDoctor")
@CrossOrigin("*")
public class TypeOfDoctorController {

    //this controller is needed to display the list of type of doctor
    @Resource
    private TypeOfDoctorFacade typeOfDoctorFacade;

    //creating API to return doctor type list

    @GetMapping("/listTypeOfDoctors")
    public List<TypeOfDoctorDTO> getAllDoctorType() throws Exception {
        return typeOfDoctorFacade.getAllDoctorType();
    }








}
