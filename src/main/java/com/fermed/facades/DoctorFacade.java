package com.fermed.facades;

import com.fermed.controllers.Doctor;
import com.fermed.controllers.HomeController;
import com.fermed.serviceImpl.DoctorServiceImpl;
import com.fermed.services.DoctorService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.print.Doc;

@Data
public class DoctorFacade  implements DoctorService{

   @Resource
   private DoctorService doctorService;


   @Override
   public Doctor createDoctor(Doctor doctor) {
      if(){

      }
      return null;
   }

   @Override
   public Doctor getDoctorById(Integer id_doctor) {
      return null;
   }


}




