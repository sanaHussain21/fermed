package com.fermed.serviceImpl;

import com.fermed.DTO.DoctorDTO;
import com.fermed.repository.DoctorRepository;
import com.fermed.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;

public class DoctorRegistrationServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;


    @Override
    public void registerDoctor(DoctorDTO doctorDTO) {

    }
}
