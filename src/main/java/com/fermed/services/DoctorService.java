package com.fermed.services;


import com.fermed.model.Doctor;

public interface DoctorService  {

    //creating doctor
    Doctor createDoctor(Doctor doctor);

    //getting user by id
    Doctor getDoctorById(Integer id_doctor);


}
