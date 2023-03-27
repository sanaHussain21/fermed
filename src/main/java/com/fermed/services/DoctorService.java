package com.fermed.services;

import com.fermed.DTO.DoctorData;
import com.fermed.DTO.DoctorLoginDTO;
import com.fermed.response.LoginResponse;


public interface DoctorService {

    //creating doctor
    void createDoctor(DoctorData doctorData) throws Exception;

    //getting the email and password



}
