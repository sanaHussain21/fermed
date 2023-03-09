package com.fermed.services;


import com.fermed.model.Doctor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DoctorService  {

    //creating doctor
  public   Doctor createDoctor(Doctor doctor);


    //getting user by id
    public Doctor getDoctorById(Integer id_doctor);


    //getting all doctors data
     public List<Doctor> getDoctorData();

}
