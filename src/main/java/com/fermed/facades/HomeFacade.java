package com.fermed.facades;

import com.fermed.model.Doctor;
import com.fermed.repository.DoctorRepository;
import com.fermed.services.HomeService;
import lombok.Data;

import javax.annotation.Resource;
import java.util.List;

@Data
public class HomeFacade implements HomeService {

   @Resource
   private HomeService doctorService;

   private DoctorRepository doctorRepository;

   @Override
   public List<Doctor> getAllDoctors() {
      return null;
   }
}




