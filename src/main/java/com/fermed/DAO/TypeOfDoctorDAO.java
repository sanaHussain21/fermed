package com.fermed.DAO;

import com.fermed.DTO.TypeOfDoctorDTO;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public interface TypeOfDoctorDAO {
    List<TypeOfDoctorDTO> getAllDoctorType() throws SQLException;
}
