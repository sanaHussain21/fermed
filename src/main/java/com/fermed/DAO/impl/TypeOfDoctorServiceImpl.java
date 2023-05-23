package com.fermed.DAO.impl;

import com.fermed.DAO.DatabaseDAO;
import com.fermed.DAO.TypeOfDoctorDAO;
import com.fermed.DTO.TypeOfDoctorDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeOfDoctorServiceImpl implements TypeOfDoctorDAO {



    @Override
    public List<TypeOfDoctorDTO> getAllDoctorType() throws SQLException {
        List<TypeOfDoctorDTO> typeOfDoctorList = new ArrayList<>();

        Connection connection;
        connection = DatabaseDAO.getConnection();
        //SELECT id_type_of_doctor, nome, code, description FROM type_of_doctor;

        return null;
    }
}
