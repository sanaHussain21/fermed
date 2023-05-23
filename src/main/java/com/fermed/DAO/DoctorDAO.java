package com.fermed.DAO;


import com.fermed.DTO.DoctorDTO;
import com.fermed.model.Doctor;
import org.springframework.stereotype.Component;

import javax.print.Doc;
import java.sql.SQLException;

@Component
public interface DoctorDAO {
    void createDoctor(Doctor doctor) throws SQLException;


    Doctor loginDoctor(Doctor doctor1) throws SQLException;

    //for testing purpose
    void doctorData(DoctorDTO doctorDTO) throws Exception;

    void getDoctorById(DoctorDTO  doctorDTO) throws SQLException;
}
