package com.fermed.services;

import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorData;
import com.fermed.model.Doctor;


public interface DoctorService {

    //creating doctor
    DoctorDTO  createDoctor(DoctorDTO doctorDTO) throws Exception;

    DoctorDTO dtoToDoctorData(DoctorDTO doctorDTO);
}
