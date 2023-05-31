package com.fermed.controllers;

import com.fermed.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {
}
