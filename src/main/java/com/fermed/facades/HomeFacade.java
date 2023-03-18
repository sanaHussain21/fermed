package com.fermed.facades;

import com.fermed.DTO.DoctorDTO;
import org.springframework.stereotype.Component;


import java.util.List;


@Component
public interface HomeFacade{

   //getting list of doctors
   List<DoctorDTO> getAllDoctors();





}




