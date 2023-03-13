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
   public DoctorDTO createDoctor(DoctorDTO doctorDTO) {

     return null;
   }

   @Override
   public DoctorDTO getDoctorById(Integer id_doctor) {
      return null;
   }

   @Override
   public DoctorDTO updateDoctor(DoctorDTO doctorDTO, Integer id_doctor) {
      return null;
   }

   @Override
   public void deleteDoctor(Integer id_doctor) {

   }

   @Override
   public List<Doctor> getAllDoctors() {
      return null;
   }
}




