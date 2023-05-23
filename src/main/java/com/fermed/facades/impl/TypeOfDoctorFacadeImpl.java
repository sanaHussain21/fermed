package com.fermed.facades.impl;

import com.fermed.DTO.TypeOfDoctorDTO;
import com.fermed.facades.TypeOfDoctorFacade;
import com.fermed.model.TypeOfDoctor;
import com.fermed.services.TypeOfDoctorService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class TypeOfDoctorFacadeImpl implements TypeOfDoctorFacade {

    @Resource
    private TypeOfDoctorService typeOfDoctorService;

    @Override
    public List<TypeOfDoctorDTO> getAllDoctorType() throws Exception {
        return typeOfDoctorService.getAllDoctorType();
    }
}
