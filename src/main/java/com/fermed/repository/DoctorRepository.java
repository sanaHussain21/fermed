package com.fermed.repository;


import com.fermed.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.print.Doc;


@EnableJpaRepositories
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

   //finding email and password for login
     Doctor findByEmailAndPassword(String email, String password);
     Doctor findByEmail(String email);



}
