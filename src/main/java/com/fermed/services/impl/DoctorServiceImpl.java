package com.fermed.services.impl;


import com.fermed.DAO.DatabaseDAO;
import com.fermed.DAO.DoctorDAO;
import com.fermed.DTO.DoctorData;
import com.fermed.model.Doctor;
import com.fermed.services.DoctorService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Resource
    private DoctorDAO doctorDAO;

    Connection connection;

    public DoctorServiceImpl() throws SQLException {
       connection =  DatabaseDAO.getConnection();
    }

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
/*
        String insertQuery = "INSERT INTO doctor(name, surname, gender,id_type_of_doctor, insurance_id_insurance, email, password, username) " +
                "VALUES('"+doctor.getName()+"', '"+doctor.getSurname()+"', '"+doctor.getGender()+"', "+doctor.getId_type_of_doctor()+", "+doctor.getInsurance_id_insurance()+",  '"+doctor.getEmail()+"','"+doctor.getUsername()+"','"+doctor.getPassword()+"')";

        try{
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                preparedStatement.executeUpdate();
                System.out.println("DOCTOR DATA INSERTED SUCCESSFULLY! :)");
    }catch (SQLException e){
            e.printStackTrace();
        }
*/
    }

}