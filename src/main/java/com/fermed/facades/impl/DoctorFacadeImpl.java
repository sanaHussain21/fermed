package com.fermed.facades.impl;

import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorData;
import com.fermed.facades.DoctorFacade;
import com.fermed.model.Doctor;
import com.fermed.repository.DoctorRepository;
import com.fermed.services.DoctorService;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


@Component
public class DoctorFacadeImpl implements DoctorFacade {

    @Resource
    private DoctorService doctorService;


    @Autowired
    private ModelMapper modelMapper;



    private DoctorRepository doctorRepository;


    @Override
    public DoctorDTO createDoctor(DoctorDTO doctorDTO) throws Exception {
        //CONVERSION FROM DTO -> DATA
      DoctorData doctorData = this.dtoToDoctorData(doctorDTO);
      //DoctorData savedDoctorData = this.doctorRepository.save(doctorData);
      return doctorService.dtoToDoctorData(doctorData); //MUST BE CHECKED

    }

    //conversion from DTO TO DATA
    public DoctorData dtoToDoctorData(DoctorDTO doctorDTO) {
        DoctorData doctorData = this.modelMapper.map(doctorDTO, DoctorData.class);
        return doctorData;
    }

    //conversion from doctor data to dto
    public DoctorDTO doctorDataToDto(DoctorData doctorData){
        DoctorDTO doctorDTO  = this.modelMapper.map(doctorData, DoctorDTO.class);
        return doctorDTO;
    }

}
