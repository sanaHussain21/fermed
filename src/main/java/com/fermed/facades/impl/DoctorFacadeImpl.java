package com.fermed.facades.impl;

import com.fermed.DTO.DoctorDTO;
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
       Doctor doctor = this.dtoToDoctor(doctorDTO);
       Doctor savedDoctor = this.doctorRepository.save(doctor);
         this.doctorToDto(savedDoctor);
         System.out.println("Siamo passati da doctor facade a doctor service :)");
        return doctorService.createDoctor(doctorDTO);
        //CONVERSION FROM DTO -> DATA

    }




    //conversion from DTO TO DATA
    public Doctor dtoToDoctor(DoctorDTO doctorDTO)
    {
        Doctor doctor = this.modelMapper.map(doctorDTO, Doctor.class);
        return doctor;
    }

    //conversion form doctor to dto
    public DoctorDTO doctorToDto(Doctor doctor){
        DoctorDTO doctorDTO  = new DoctorDTO();
        return doctorDTO;
    }

}
