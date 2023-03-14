package com.fermed.facades;

import com.fermed.model.Doctor;
import com.fermed.services.DoctorService;

import javax.annotation.Resource;

public class DoctorFacade implements DoctorService {

    @Resource
    private DoctorService doctorService;


    @Override
    public Doctor createDoctor(Doctor doctor) throws Exception {
        return this.doctorService.createDoctor(doctor);
    }
}
