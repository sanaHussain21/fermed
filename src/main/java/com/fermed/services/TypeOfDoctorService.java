package com.fermed.services;

import com.fermed.DTO.TypeOfDoctorDTO;

import java.sql.SQLException;
import java.util.List;

public interface TypeOfDoctorService {
    List<TypeOfDoctorDTO> getAllDoctorType() throws Exception;
}
