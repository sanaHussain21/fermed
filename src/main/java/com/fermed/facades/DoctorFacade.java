package com.fermed.facades;

import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorLoginDTO;
import com.fermed.model.Doctor;
import com.fermed.response.LoginResponse;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public interface DoctorFacade {

     //creating the doctor
     void createDoctor(DoctorDTO doctorDTO) throws Exception;


     //this method is needed for login
    void loginDoctor(DoctorLoginDTO doctorLoginDTO) throws Exception;








}
