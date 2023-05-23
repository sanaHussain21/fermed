package com.fermed.services.impl;

import com.fermed.DAO.TypeOfDoctorDAO;
import com.fermed.DTO.TypeOfDoctorDTO;
import com.fermed.model.TypeOfDoctor;
import com.fermed.services.TypeOfDoctorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@Service
public class TypeOfDoctorServiceImpl implements TypeOfDoctorService {

    @Resource
    private TypeOfDoctorDAO typeOfDoctorServiceDAO;

    @Override
    public List<TypeOfDoctorDTO> getAllDoctorType() throws Exception {
        return typeOfDoctorServiceDAO.getAllDoctorType();
    }
}
