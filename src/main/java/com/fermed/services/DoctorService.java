package com.fermed.services;

import com.fermed.controllers.Doctor;


public interface DoctorService  {


    Doctor createDoctor(Doctor doctor);
    Doctor getDoctorById(Integer id_doctor);


}
