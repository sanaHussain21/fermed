package com.fermed.services;


import com.fermed.DTO.DoctorDTO;
import com.fermed.model.Doctor;
import org.springframework.stereotype.Repository;

import java.util.List;



public interface DoctorService  {

    //creating doctor
    DoctorDTO createDoctor(DoctorDTO doctorDTO);


    //getting user by id
    DoctorDTO getDoctorById(Integer id_doctor);

    //update doctor
    DoctorDTO updateDoctor(DoctorDTO doctorDTO, Integer id_doctor);


    //delete doctor
     void deleteDoctor(Integer id_doctor);

    //getting all doctors already done
    List<Doctor> getAllDoctors();



}
