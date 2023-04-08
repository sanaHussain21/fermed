package com.fermed.services;

import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorData;

import java.sql.SQLException;


public interface DoctorService {

    //creating doctor
    void createDoctor(DoctorData doctorData) throws Exception;

    void loginDoctor(String email, String password) throws Exception;


    //for testing purpose
    void doctorData(DoctorDTO doctorDTO) throws SQLException, Exception;
}
