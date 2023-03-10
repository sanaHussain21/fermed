package com.fermed.repository;

import com.fermed.model.Doctor;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

  public Doctor findById(int id_doctor);
}
