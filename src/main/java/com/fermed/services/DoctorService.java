package com.fermed.services;

import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorData;
import com.fermed.model.Doctor;

import java.sql.SQLException;


public interface DoctorService {

    //creating doctor
    void createDoctor(DoctorData doctorData) throws Exception;




    Doctor loginDoctor(DoctorData doctorData1) throws Exception;




    //for testing purpose
    void doctorData(DoctorDTO doctorDTO) throws  Exception;



}
