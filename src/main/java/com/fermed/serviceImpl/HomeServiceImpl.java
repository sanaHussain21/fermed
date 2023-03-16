package com.fermed.serviceImpl;

import com.fermed.DAO.DatabaseDAO;
import com.fermed.model.Doctor;
import com.fermed.repository.DoctorRepository;

import com.fermed.services.HomeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@Service
public class HomeServiceImpl implements HomeService {

    //list of doctors already implemented
    @Autowired
    static List<Doctor> doctorList = new ArrayList<>();

    Connection connection;
    public HomeServiceImpl() throws SQLException
    {
        connection = DatabaseDAO.getConnection();
    }

    //getting the data
    @Override
    public List<Doctor> getAllDoctors() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM doctor");
            ResultSet resultSet = preparedStatement.executeQuery();

            //it will read one by one all raws from the doctor's table
            while(resultSet.next()){
                Doctor doctor= new Doctor();
                doctor.setId_doctor(resultSet.getInt(1));
                doctor.setName(resultSet.getString(2));
                doctor.setSurname(resultSet.getString(3));
                doctor.setGender(resultSet.getString(4));
                doctor.setEmail(resultSet.getString(5));
                doctor.setPassword(resultSet.getString(6));
                doctorList.add(doctor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctorList;
}



/*
//to check
    @Override
    public Doctor getDoctorById(Integer id_doctor){
        Doctor doctor = this.doctorRepository.findById(id_doctor).orElseThrow(()-> new ResourceNotFoundException("Doctor", "id_doctor", id_doctor));
        return this.getDoctorById(id_doctor);
    }


    @Override
    public Optional<Doctor> getDoctorById(Integer id_doctor) {
        return doctorRepository.findById(id_doctor);
    }
    */
}
