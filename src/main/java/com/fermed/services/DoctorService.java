package com.fermed.services;


import com.fermed.DTO.DoctorDTO;
import com.fermed.model.Doctor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Repository

public interface DoctorService  {

    //creating doctor
   public DoctorDTO createDoctor(DoctorDTO doctor);


    //getting user by id
    public DoctorDTO getDoctorById(Integer id_doctor);


    //getting all doctors
     public List<DoctorDTO> getAllDoctors();

}
