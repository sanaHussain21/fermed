package com.fermed.repository;

import com.fermed.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.regex.Pattern;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

    public Patient findByUsername(String username);
}
