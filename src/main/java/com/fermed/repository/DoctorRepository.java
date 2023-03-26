package com.fermed.repository;


import com.fermed.model.Doctor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.print.Doc;
import java.util.Optional;


@EnableJpaRepositories
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

   //finding email and password for login
    Optional<Doctor> findByEmailAndPassword(String email, String password);
     Doctor findByEmail(String email);



}
