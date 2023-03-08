package com.fermed.serviceImpl;

import com.fermed.controllers.DoctorDTO;
import com.fermed.services.DoctorService;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class DoctorServiceImpl implements DoctorService  {

    @Override
    public DoctorDTO createDoctor(DoctorDTO doctorDTO) {
        return null; //must be checked
    }

    @Override
    public DoctorDTO getDoctorById(Integer id_doctor) {
        return null; //must be checked
    }
}
