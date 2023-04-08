package com.fermed.facades;

import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorLoginDTO;
import org.springframework.stereotype.Component;



@Component
public interface DoctorFacade {

     //creating the doctor
     void createDoctor(DoctorDTO doctorDTO) throws Exception;


     //this method is needed for login
    void loginDoctor(DoctorLoginDTO doctorLoginDTO) throws Exception;


    //testing
    void doctorData(DoctorDTO doctorDTO);
}
