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
        doctorData.setEmail(doctorDTO.getEmail());
        doctorData.setUsername(doctorDTO.getUsername());
        doctorData.setPassword(doctorDTO.getPassword());
        doctorService.createDoctor(doctorData);

    }
/*
    //converting from DTO TO DATA
    private DoctorData dtoToDoctorData(DoctorDTO doctorDTO){
        DoctorData doctorData = new DoctorData();
        doctorData.setName(doctorDTO.getName());
        doctorData.setSurname(doctorDTO.getSurname());
        doctorData.setGender(doctorDTO.getGender());
        doctorData.setEmail(doctorDTO.getEmail());
        doctorData.setUsername(doctorDTO.getUsername());
        doctorData.setPassword(doctorDTO.getPassword());
        return doctorData;
    }

    //CONVERTING FROM DATA TO DTO
    private DoctorDTO doctorDataToDto(DoctorData doctorData){
        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setName(doctorData.getSurname());
        doctorDTO.setSurname(doctorData.getSurname());
        doctorDTO.setGender(doctorData.getGender());
        doctorDTO.setEmail(doctorData.getEmail());
        doctorDTO.setUsername(doctorData.getUsername());
        doctorDTO.setPassword(doctorData.getPassword());
        return  doctorDTO;
    }
*/
}
