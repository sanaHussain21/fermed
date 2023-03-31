package com.fermed.services;

import com.fermed.DTO.DoctorData;


public interface DoctorService {

    //creating doctor
    void createDoctor(DoctorData doctorData) throws Exception;

    void loginDoctor(String email, String password) throws Exception;





}
