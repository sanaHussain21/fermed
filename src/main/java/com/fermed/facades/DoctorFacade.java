package com.fermed.facades;

import com.fermed.model.Doctor;
import com.fermed.repository.DoctorRepository;
import com.fermed.services.DoctorService;
import lombok.Data;

import javax.annotation.Resource;
import java.util.List;

@Data
public class DoctorFacade  implements DoctorService{

   @Resource
   private DoctorService doctorService;

   private DoctorRepository doctorRepository;


   @Override
   public Doctor createDoctor(Doctor doctor) {
      //to check whether the user is already in the database or not
      //Doctor doctorCheck = this.doctorRepository.findById(doctor)
      //VADIZATION OF DATA
      //DTO TO DATA

      return doctor;
   }

   @Override
   public Doctor getDoctorById(Integer id_doctor) {
      return null;
   }

   @Override
   public List<Doctor> getDoctorData() {
      return null;
   }


}




