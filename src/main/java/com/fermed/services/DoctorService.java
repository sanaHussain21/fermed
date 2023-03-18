package com.fermed.services;

import com.fermed.DTO.DoctorData;


public interface DoctorService {

    //creating doctor
    void  createDoctor(DoctorData doctorDTO) throws Exception;


}
