package com.fermed.facades;

import com.fermed.DTO.DoctorDTO;
import org.springframework.stereotype.Component;

@Component
public interface DoctorFacade {

     void createDoctor(DoctorDTO doctorDTO);
}
