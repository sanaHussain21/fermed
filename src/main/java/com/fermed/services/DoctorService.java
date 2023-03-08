package com.fermed.services;

import com.fermed.controllers.DoctorDTO;
import org.springframework.stereotype.Service;


public interface DoctorService  {


    DoctorDTO createDoctor(DoctorDTO doctorDTO);
    DoctorDTO getDoctorDTO();

}
