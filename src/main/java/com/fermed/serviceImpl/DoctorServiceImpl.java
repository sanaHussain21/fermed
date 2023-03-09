package com.fermed.serviceImpl;

import com.fermed.DAO.DoctorDAO;
import com.fermed.model.Doctor;
import com.fermed.repository.DoctorRepository;
import com.fermed.services.DoctorService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class DoctorServiceImpl  implements DoctorService {

    private DoctorRepository doctorRepository;
    //saving the created doctor
    @Override
    public Doctor createDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor getDoctorById(Integer id_doctor) {
        return null;
    }

    //list of doctors
    @Autowired
    static List<Doctor> doctorlist = new ArrayList<>();

    Connection connection;
    public DoctorServiceImpl() throws SQLException
    {
        connection = DoctorDAO.getConnection();
    }

    //getting the data
    @Override
    public List<Doctor> getDoctorData() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM doctor LIMIT 5");
            preparedStatement.executeQuery();
            ResultSet resultSet = preparedStatement.executeQuery();

            //it will read one by one all raws from the doctor table
            while(resultSet.next()){
                Doctor doctor = new Doctor();
                doctor.
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
