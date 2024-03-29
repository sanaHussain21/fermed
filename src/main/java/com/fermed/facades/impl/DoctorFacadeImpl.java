package com.fermed.facades.impl;

import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorData;
import com.fermed.DTO.DoctorLoginDTO;
import com.fermed.facades.DoctorFacade;
import com.fermed.model.Doctor;
import com.fermed.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class DoctorFacadeImpl implements DoctorFacade {

    @Resource
    private DoctorService doctorService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


//this.passwordEncoder.encode(doctorDTO.getPassword())

    @Override
    public void createDoctor(DoctorDTO doctorDTO) throws Exception {
        //CONVERSION FROM DTO -> DATA
        DoctorData doctorData = new DoctorData();
        doctorData.setName(doctorDTO.getName());
        doctorData.setSurname(doctorDTO.getSurname());
        doctorData.setGender(doctorDTO.getGender());
        doctorData.setId_type_of_doctor(doctorDTO.getId_type_of_doctor());
        doctorData.setInsurance_id_insurance(doctorDTO.getInsurance_id_insurance());
        doctorData.setEmail(doctorDTO.getEmail());
        doctorData.setUsername(doctorDTO.getUsername());
        doctorData.setPassword(doctorDTO.getPassword());
        doctorService.createDoctor(doctorData);
    }



   @Override
    public Doctor loginDoctor(DoctorLoginDTO doctorLoginDTO) throws Exception {
          //testing
        DoctorData doctorData1 = new DoctorData();
        doctorData1.setEmail(doctorLoginDTO.getEmail());
        doctorData1.setPassword(doctorLoginDTO.getPassword());
        return doctorService.loginDoctor(doctorData1);

    }


















    //for testing purpose
    @Override
    public void doctorData(DoctorDTO doctorDTO) throws Exception {
        doctorService.doctorData(doctorDTO);
    }

    /*
    @Override
    public void getDoctorDepartment(DoctorDTO doctorDTO) throws Exception {
        doctorService.getDoctorDepartment(doctorDTO);
    }
*/

}
