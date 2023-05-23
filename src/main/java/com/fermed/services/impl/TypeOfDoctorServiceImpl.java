package com.fermed.services.impl;

import com.fermed.DAO.TypeOfDoctorDAO;
import com.fermed.DTO.TypeOfDoctorDTO;
import com.fermed.model.TypeOfDoctor;
import com.fermed.services.TypeOfDoctorService;

import javax.annotation.Resource;
import java.util.List;

public class TypeOfDoctorServiceImpl implements TypeOfDoctorService {

    @Resource
    private TypeOfDoctorDAO typeOfDoctorServiceDAO;

    @Override
    public List<TypeOfDoctorDTO> getAllDoctorType() {
        return typeOfDoctorServiceDAO.getAllDoctorType();
    }
}
