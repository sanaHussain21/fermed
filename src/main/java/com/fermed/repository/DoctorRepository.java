package com.fermed.repository;

import com.fermed.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.stereotype.Repository;




@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Integer> {

   Doctor findByUsername(String username);

}
