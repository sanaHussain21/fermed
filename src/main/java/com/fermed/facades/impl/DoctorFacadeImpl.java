package com.fermed.facades.impl;

import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorData;
import com.fermed.DTO.DoctorLoginDTO;
import com.fermed.facades.DoctorFacade;


import com.fermed.model.Doctor;
import com.fermed.repository.DoctorRepository;
import com.fermed.response.LoginResponse;
import com.fermed.services.DoctorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.Optional;


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
    public void loginDoctor(DoctorLoginDTO doctorLoginDTO) throws Exception {
        String email = doctorLoginDTO.getEmail();
        String password = doctorLoginDTO.getPassword();

        if (email != null && password != null) {
            doctorService.loginDoctor(email, password);
        }else {
            throw  new Exception("Email and Password are invalid :)");
        }

    }


/*
    @Override
    public LoginResponse  loginDoctor(DoctorLoginDTO doctorLoginDTO) throws Exception {
        String msg = "";
        Doctor doctor1 = doctorService.findByEmail(doctorLoginDTO.getEmail());
        if (doctor1 != null) {
            String password = doctorLoginDTO.getPassword();
            String encodedPassword = doctor1.getPassword();
            Boolean isPwdRight = bCryptPasswordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Doctor> doctor = doctorService.findByEmailAndPassword(doctorLoginDTO.getEmail(), encodedPassword);
                if (doctor.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {

                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }


    }
*/


    }
