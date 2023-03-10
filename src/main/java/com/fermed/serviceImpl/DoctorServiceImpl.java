package com.fermed.serviceImpl;

import com.fermed.DAO.DoctorDAO;
import com.fermed.DTO.DoctorDTO;
import com.fermed.exception.ResourceNotFoundException;
import com.fermed.model.Doctor;
import com.fermed.repository.DoctorRepository;
import com.fermed.services.DoctorService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

@Data
@Service
public class DoctorServiceImpl  implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;


    //creating doctor
    @Override
    public DoctorDTO createDoctor(DoctorDTO doctorDTO)
    {
        Doctor doctor = this.dtoToDoctor(doctorDTO);
        Doctor savedDoctor = this.doctorRepository.save(doctor);
        return this.doctorToDto(savedDoctor);
    }


    //getting doctor by id
    @Override
    public DoctorDTO getDoctorById(Integer id_doctor)
    {
        return null;
    }


    @Override
    public DoctorDTO updateDoctor(DoctorDTO doctorDTO, Integer id_doctor)
    {
        //we created this exception because we give a id that is not present in the database, it will throw this exception
        Doctor doctor = this.doctorRepository.findById(id_doctor).orElseThrow(()-> new ResourceNotFoundException("Doctor", "id_doctor", id_doctor));
        return null;
    }


    @Override
    public DoctorDTO deleteDoctor(Integer id_doctor)
    {
        return null;
    }


    //list of doctors already implemented
    @Autowired
    static List<DoctorDTO> doctorDTOList = new ArrayList<>();

    Connection connection;
    public DoctorServiceImpl() throws SQLException
    {
        connection = DoctorDAO.getConnection();
    }

    //getting the data
    @Override
    public List<DoctorDTO> getAllDoctors() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM doctor LIMIT 5");
            ResultSet resultSet = preparedStatement.executeQuery();

            //it will read one by one all raws from the doctor's table
            //we will check this in the broweser to get all doctors data
            while(resultSet.next()){
                DoctorDTO doctorDTO = new DoctorDTO();
                doctorDTO.setId_doctor(resultSet.getInt(1));
                doctorDTO.setName(resultSet.getString(2));
                doctorDTO.setSurname(resultSet.getString(3));
                doctorDTO.setGender(resultSet.getString(4));
                doctorDTO.setEmail(resultSet.getString(5));
                doctorDTO.setPassword(resultSet.getString(6));
                doctorDTOList.add(doctorDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctorDTOList;
    }


    //converting dto to user
    public Doctor dtoToDoctor(DoctorDTO doctorDTO)
    {
        Doctor doctor = new Doctor();
        doctor.setId_doctor(doctorDTO.getId_doctor());
        doctor.setName(doctorDTO.getName());
        doctor.setSurname(doctorDTO.getSurname());
        doctor.setGender(doctorDTO.getGender());
        doctor.setEmail(doctorDTO.getEmail());
        doctor.setPassword(doctorDTO.getPassword());
        doctor.setSurname(doctorDTO.getSurname());
        return  doctor;
    }

    //converting user to dto
    public DoctorDTO doctorToDto(Doctor doctor)
    {
      DoctorDTO doctorDTO = new DoctorDTO();
      doctorDTO.setId_doctor(doctor.getId_doctor());
      doctorDTO.setName(doctor.getName());
      doctorDTO.setSurname(doctor.getSurname());
      doctorDTO.setGender(doctor.getGender());
      doctorDTO.setEmail(doctor.getEmail());
      doctorDTO.setPassword(doctor.getPassword());
      doctorDTO.setUsername(doctor.getUsername());
      return  doctorDTO;
    }

}
