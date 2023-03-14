package com.fermed.services;

import com.fermed.DTO.DoctorDTO;
import com.fermed.exception.DoctorFoundException;
import com.fermed.model.Doctor;

public interface DoctorService {

    //creating doctor
     Doctor createDoctor(Doctor doctor) throws Exception;


}
