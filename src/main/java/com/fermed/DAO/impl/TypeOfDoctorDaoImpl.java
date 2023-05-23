package com.fermed.DAO.impl;

import com.fermed.DAO.DatabaseDAO;
import com.fermed.DAO.TypeOfDoctorDAO;
import com.fermed.DTO.TypeOfDoctorDTO;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class TypeOfDoctorDaoImpl implements TypeOfDoctorDAO {



    @Override
    public List<TypeOfDoctorDTO> getAllDoctorType() throws SQLException {
        List<TypeOfDoctorDTO> typeOfDoctorList = new ArrayList<>();

        Connection connection;
        connection = DatabaseDAO.getConnection();
        //SELECT id_type_of_doctor, nome, code, description FROM type_of_doctor;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id_type_of_doctor, nome, code, description FROM type_of_doctor");
            ResultSet resultSet = preparedStatement.executeQuery();


            while(resultSet.next()){
                TypeOfDoctorDTO typeOfDoctorDTO = new TypeOfDoctorDTO();
                typeOfDoctorDTO.setId_type_of_doctor(resultSet.getInt(1));
                typeOfDoctorDTO.setNome(resultSet.getString(2));
                typeOfDoctorDTO.setCode(resultSet.getInt(3));
                typeOfDoctorDTO.setDescription(resultSet.getString(4));
                typeOfDoctorList.add(typeOfDoctorDTO);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return typeOfDoctorList;
    }
}
