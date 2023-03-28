package com.fermed.services;

import com.fermed.DTO.DoctorData;
import com.fermed.DTO.DoctorLoginDTO;
import com.fermed.model.Doctor;
import com.fermed.response.LoginResponse;

import java.sql.SQLException;
import java.util.Optional;


public interface DoctorService {

    //creating doctor
    void createDoctor(DoctorData doctorData) throws Exception;

   // Doctor findByEmail(String email) throws Exception;

    void findByEmailAndPassword(String temporaryEmail, String temporaryPassword) throws Exception;

    //getting the email and password



}
