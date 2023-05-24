package com.fermed.facades;

import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorData;
import com.fermed.DTO.DoctorLoginDTO;
import com.fermed.model.Doctor;
import org.springframework.stereotype.Component;



@Component
public interface DoctorFacade {

     //creating the doctor
     void createDoctor(DoctorDTO doctorDTO) throws Exception;


     //this method is needed for login
     Doctor loginDoctor(DoctorLoginDTO doctorLoginDTO) throws Exception;


    //this method is for testing
   void doctorData(DoctorDTO doctorDTO) throws Exception;


    //void getDoctorDepartment(DoctorDTO doctorDTO) throws Exception;



}
