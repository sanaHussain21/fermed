package com.fermed.services;


import com.fermed.DTO.DoctorDTO;
import com.fermed.model.Doctor;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;



public interface HomeService {


    //getting all doctors already done
    List<Doctor> getAllDoctors();



}
