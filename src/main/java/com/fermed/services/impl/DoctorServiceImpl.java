package com.fermed.services.impl;


import com.fermed.DAO.DatabaseDAO;
import com.fermed.DAO.DoctorDAO;
import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorData;
import com.fermed.model.Doctor;
import com.fermed.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.SQLException;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Resource
    private DoctorDAO doctorDAO;

   @Autowired
   private BCryptPasswordEncoder bCryptPasswordEncoder;

    Connection connection;

    public DoctorServiceImpl() throws SQLException {
       connection =  DatabaseDAO.getConnection();
    }

    //for bcrypting the password:   doctor.setPassword(this.bCryptPasswordEncoder.encode(doctorData.getPassword()));
    @Override
    public void createDoctor(DoctorData doctorData) throws Exception {
        //CONVERSION FROM DATA -> MODEL

         Doctor doctor = new Doctor();
         doctor.setName(doctorData.getName());
         doctor.setSurname(doctorData.getSurname());
         doctor.setGender(doctorData.getGender());
         doctor.setId_type_of_doctor(doctorData.getId_type_of_doctor());
         doctor.setInsurance_id_insurance(doctorData.getInsurance_id_insurance());
         doctor.setEmail(doctorData.getEmail());
         doctor.setUsername(doctorData.getUsername());
         doctor.setPassword(doctorData.getPassword());
         doctorDAO.createDoctor(doctor);
    }



    @Override
    public Doctor loginDoctor(DoctorData doctorData1) throws Exception {

        //conversion from DATA-> O MODEL
        Doctor doctor1= new Doctor();
             doctor1.setEmail(doctorData1.getEmail());
             doctor1.setPassword(doctorData1.getPassword());
            return doctorDAO.loginDoctor(doctor1);

    }





    











    //for testing purpose
    @Override
    public void doctorData(DoctorDTO doctorDTO) throws Exception {
       doctorDAO.doctorData(doctorDTO);
    }
    /*
    @Override
    public void getDoctorDepartment(DoctorDTO doctorDTO) throws Exception {
        doctorDAO.getDoctorDepartment(doctorDTO);
    }
    */


}