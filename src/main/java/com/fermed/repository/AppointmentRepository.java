package com.fermed.repository;

import com.fermed.DTO.AppointmentDTO;
import com.fermed.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@EnableJpaRepositories
@Repository
public interface AppointmentRepository extends JpaRepository<AppointmentDTO, Integer> {

}
