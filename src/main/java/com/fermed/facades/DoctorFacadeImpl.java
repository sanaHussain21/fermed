package com.fermed.facades;

import com.fermed.DTO.DoctorDTO;
import com.fermed.model.Doctor;
import com.fermed.services.DoctorService;

import javax.annotation.Resource;

public class DoctorFacadeImpl implements DoctorFacade {

    @Resource
    private DoctorService doctorService;


    @Override
    public void createDoctor(DoctorDTO doctorDTO){
        System.out.println("SIAMO PASSATI DA FACADE A SERVICE");
        //CONVERSION FROM DTO -> DATA
     doctorService.createDoctor(doctorDTO);
    }
}
