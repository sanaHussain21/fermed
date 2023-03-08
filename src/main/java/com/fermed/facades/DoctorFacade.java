package com.fermed.facades;

import com.fermed.model.Doctor;
import com.fermed.services.DoctorService;
import lombok.Data;

import javax.annotation.Resource;

@Data
public class DoctorFacade  implements DoctorService{

   @Resource
   private DoctorService doctorService;


   @Override
   public Doctor createDoctor(Doctor doctor) {
        if(doctor != null){

         
        }
      return doctor;
   }

   @Override
   public Doctor getDoctorById(Integer id_doctor) {
      return null;
   }


}




