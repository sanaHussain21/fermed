package com.fermed.DAO;

import com.fermed.DTO.TypeOfDoctorDTO;

import java.sql.SQLException;
import java.util.List;

public interface TypeOfDoctorDAO {
    List<TypeOfDoctorDTO> getAllDoctorType() throws SQLException;
}
