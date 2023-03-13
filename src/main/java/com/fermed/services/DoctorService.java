package com.fermed.services;


import com.fermed.DTO.DoctorDTO;
import com.fermed.model.Doctor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface DoctorService  {

    //creating doctor
  public DoctorDTO createDoctor(DoctorDTO doctor);


    //getting user by id
    public DoctorDTO getDoctorById(Integer id_doctor);

    //update doctor
     public DoctorDTO updateDoctor(DoctorDTO doctorDTO, Integer id_doctor);


    //delete doctor
     void deleteDoctor(Integer id_doctor);

    //getting all doctors already done
    public List<Doctor> getAllDoctors();



}
