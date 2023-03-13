package com.fermed.facades;

import com.fermed.DTO.DoctorDTO;
import com.fermed.model.Doctor;
import com.fermed.repository.DoctorRepository;
import com.fermed.services.DoctorService;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

@Data
public class DoctorFacade  implements DoctorService{

   @Resource
   private DoctorService doctorService;

   private DoctorRepository doctorRepository;



   @Override
   public DoctorDTO createDoctor(DoctorDTO doctorDTO) {

      return this.doctorService.createDoctor(doctorDTO);
   }

   @Override
   public DoctorDTO getDoctorById(Integer id_doctor) {
      doctorService.getDoctorById(id_doctor);
      return this.getDoctorById(id_doctor);
   }

   @Override
   public DoctorDTO updateDoctor(DoctorDTO doctorDTO, Integer id_doctor) {
      doctorService.updateDoctor(doctorDTO, id_doctor);
      return this.updateDoctor(doctorDTO, id_doctor);
   }

   @Override
   public void deleteDoctor(Integer id_doctor) {
   doctorService.deleteDoctor(id_doctor);

   }

   @Override
   public List<Doctor> getAllDoctors() {
      return null;
   }
}




