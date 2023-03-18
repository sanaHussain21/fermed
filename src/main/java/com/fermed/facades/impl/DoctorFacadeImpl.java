package com.fermed.facades.impl;

import com.fermed.DTO.DoctorDTO;
import com.fermed.facades.DoctorFacade;
import com.fermed.model.Doctor;
import com.fermed.services.DoctorService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Component
public class DoctorFacadeImpl implements DoctorFacade {

    @Resource
    private DoctorService doctorService;


    @Override
    public void createDoctor(DoctorDTO doctorDTO){
        System.out.println("SIAMO PASSATI DA FACADE A SERVICE");
        //CONVERSION FROM DTO -> DATA

    }
}