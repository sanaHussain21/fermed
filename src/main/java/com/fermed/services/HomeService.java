package com.fermed.services;


import com.fermed.model.Doctor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HomeService {


    //getting all doctors already done
    List<Doctor> getAllDoctors();





}
