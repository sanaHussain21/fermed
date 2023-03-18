package com.fermed.repository;

import com.fermed.DTO.DoctorDTO;
import com.fermed.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;




@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {



}
