package com.fermed.facades;

import com.fermed.DTO.DoctorDTO;
import com.fermed.model.Doctor;
import org.springframework.stereotype.Component;

@Component
public interface DoctorFacade {

     //creating the doctor
     void createDoctor(DoctorDTO doctorDTO) throws Exception;


}
