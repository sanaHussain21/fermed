package com.fermed.services;

import com.fermed.DTO.DoctorDTO;
import com.fermed.exception.DoctorFoundException;
import com.fermed.model.Doctor;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorService {

    //creating doctor
    void  createDoctor(Doctor doctor) throws Exception;




}
