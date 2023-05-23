package com.fermed.facades.impl;

import com.fermed.DTO.TypeOfDoctorDTO;
import com.fermed.facades.TypeOfDoctorFacade;
import com.fermed.model.TypeOfDoctor;
import com.fermed.services.TypeOfDoctorService;

import javax.annotation.Resource;
import java.util.List;

public class TypeOfDoctorFacadeImpl implements TypeOfDoctorFacade {

    @Resource
    private TypeOfDoctorService typeOfDoctorService;

    @Override
    public List<TypeOfDoctorDTO> getAllDoctorType() {
        return typeOfDoctorService.getAllDoctorType();
    }
}
