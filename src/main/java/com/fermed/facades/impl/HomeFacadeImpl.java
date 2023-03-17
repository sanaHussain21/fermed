package com.fermed.facades.impl;

import com.fermed.DTO.DoctorDTO;
import com.fermed.facades.HomeFacade;
import com.fermed.services.HomeService;

import javax.annotation.Resource;
import java.util.List;

public class HomeFacadeImpl implements HomeFacade {

    @Resource
    private HomeService homeService;

    @Override
    public List<DoctorDTO> getAllDoctors() {
        return null;
    }
}
