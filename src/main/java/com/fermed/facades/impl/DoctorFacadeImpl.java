package com.fermed.facades.impl;

import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorData;
import com.fermed.facades.DoctorFacade;


import com.fermed.services.DoctorService;

import org.springframework.stereotype.Component;


import javax.annotation.Resource;


@Component
public class DoctorFacadeImpl implements DoctorFacade {

    @Resource
    private DoctorService doctorService;





    @Override
    public void createDoctor(DoctorDTO doctorDTO) throws Exception {
        //CONVERSION FROM DTO -> DATA
        DoctorData doctorData = new DoctorData();
        doctorData.setName(doctorDTO.getName());
        doctorData.setSurname(doctorDTO.getSurname());
        doctorData.setGender(doctorDTO.getGender());
        doctorData.setId_type_of_doctor(doctorDTO.getId_type_of_doctor());
        doctorData.setInsurance_id_insurance(doctorDTO.getInsurance_id_insurance());
        doctorData.setEmail(doctorDTO.getEmail());
        doctorData.setUsername(doctorDTO.getUsername());
        doctorData.setPassword(doctorDTO.getPassword());
        doctorService.createDoctor(doctorData);

    }









}
