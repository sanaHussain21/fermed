package com.fermed.facades;

import com.fermed.DTO.DoctorDTO;
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
     //VALIDATION OF THE DATA
      return doctor;
   }

   @Override
   public DoctorDTO getDoctorById(Integer id_doctor) {
      return null;
   }

   @Override
   public List<Doctor> getDoctorData() {
      return null;
   }


}




