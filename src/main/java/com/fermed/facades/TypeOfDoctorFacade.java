package com.fermed.facades;

import com.fermed.DTO.TypeOfDoctorDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TypeOfDoctorFacade {
    public List<TypeOfDoctorDTO> getAllDoctorType() throws Exception;
}
