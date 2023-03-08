package com.fermed.repository;

import com.fermed.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

  public Doctor findById(int id_doctor);
}
