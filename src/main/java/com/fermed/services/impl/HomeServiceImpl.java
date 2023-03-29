package com.fermed.services.impl;

import com.fermed.DAO.DatabaseDAO;
import com.fermed.DTO.DoctorDTO;
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


@Data
@Service
public class HomeServiceImpl implements HomeService {



    //list of doctors already implemented
    @Autowired
    static List<DoctorDTO> doctorList = new ArrayList(); //removed <>

    Connection connection;
    public HomeServiceImpl() throws SQLException
    {
        connection = DatabaseDAO.getConnection();
    }

    //getting the data
    @Override
    public List<DoctorDTO> getAllDoctors() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id_doctor, name, surname, gender, email, password, username FROM doctor");
            ResultSet resultSet = preparedStatement.executeQuery();

            //it will read one by one all raws from the doctor's table
            while(resultSet.next()){
                DoctorDTO doctorDTO= new DoctorDTO();
                doctorDTO.setId_doctor(resultSet.getInt(1));
                doctorDTO.setName(resultSet.getString(2));
                doctorDTO.setSurname(resultSet.getString(3));
                doctorDTO.setGender(resultSet.getString(4));
                doctorDTO.setEmail(resultSet.getString(5));
                doctorDTO.setPassword(resultSet.getString(6));
                doctorDTO.setUsername(resultSet.getString(7));
                doctorList.add(doctorDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctorList;
}



}
