package com.fermed.facades.impl;

import com.fermed.DTO.DoctorDTO;
import com.fermed.facades.HomeFacade;
import com.fermed.services.HomeService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class HomeFacadeImpl implements HomeFacade {

    @Resource
    private HomeService homeService;

    @Override
    public List<DoctorDTO> getAllDoctors() {
        System.out.println("Siamo passati da facade a service :)");
        return homeService.getAllDoctors();
    }
}
