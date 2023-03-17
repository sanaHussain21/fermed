package com.fermed.facades;

import com.fermed.DTO.DoctorDTO;
import org.springframework.stereotype.Repository;

import java.util.List;



public interface HomeFacade{

   //getting list of doctors
   List<DoctorDTO> getAllDoctors();





}




