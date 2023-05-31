package com.fermed.repository;

import com.fermed.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
