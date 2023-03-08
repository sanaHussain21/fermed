package com.fermed.services;

import com.fermed.controllers.DoctorDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


public interface DoctorService  {


    DoctorDTO createDoctor(DoctorDTO doctorDTO);
    DoctorDTO getDoctorById(Integer id_doctor);

}
