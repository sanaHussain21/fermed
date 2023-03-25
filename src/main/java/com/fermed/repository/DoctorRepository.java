package com.fermed.repository;


import com.fermed.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

   //finding email and password for login
    public Doctor findByEmailAndPassword(String email, String password);



}
