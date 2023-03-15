package com.fermed.facades;

import com.fermed.services.DoctorService;

import javax.annotation.Resource;

public class PatientFacade {
    @Resource
    private DoctorService doctorService;
}
