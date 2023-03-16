package com.fermed.repository;

import com.fermed.model.Doctor;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.print.Doc;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

  public Doctor findByUsername(String username);

  public Doctor findById(Integer id_doctor);
}
