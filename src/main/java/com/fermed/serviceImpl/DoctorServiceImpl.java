package com.fermed.serviceImpl;

import com.fermed.DAO.DoctorDAO;
import com.fermed.DTO.DoctorDTO;
import com.fermed.exception.ResourceNotFoundException;
import com.fermed.model.Doctor;
import com.fermed.repository.DoctorRepository;
import com.fermed.services.DoctorService;
import lombok.Data;
import org.modelmapper.ModelMapper;
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
public class DoctorServiceImpl  implements DoctorService {


    private DoctorRepository doctorRepository;

    @Autowired
    private ModelMapper modelMapper;

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
        Doctor doctor =this.doctorRepository.findById(id_doctor).orElseThrow(()-> new ResourceNotFoundException("Doctor", "id_doctor", id_doctor));
        return this.doctorToDto(doctor);
    }


    @Override
    public DoctorDTO updateDoctor(DoctorDTO doctorDTO, Integer id_doctor)
    {
        //we created this exception because we give a id that is not present in the database, it will throw this exception
        Doctor doctor = this.doctorRepository.findById(id_doctor).orElseThrow(()-> new ResourceNotFoundException("Doctor", "id_doctor", id_doctor));
        doctor.setName(doctorDTO.getName());
        doctor.setSurname(doctorDTO.getSurname());
        doctor.setEmail(doctor.getEmail());
        doctor.setPassword(doctor.getPassword());
        doctor.setUsername(doctor.getUsername());
        Doctor updatedDoctor = this.doctorRepository.save(doctor);
       DoctorDTO doctorDTO1 =  this.doctorToDto(updatedDoctor);
        return doctorDTO1;
    }


    @Override
    public void deleteDoctor(Integer id_doctor)
    {
        //we handle the exception, in case we wanna deleted doctor_id , which is not present in the database, at that case it is gonna throw this exception
       Doctor doctor =  this.doctorRepository.findById(id_doctor).orElseThrow(()-> new ResourceNotFoundException("Doctor", "id_doctor", id_doctor));
       this.doctorRepository.delete(doctor);

    }


    //list of doctors already implemented
    @Autowired
    static List<Doctor> doctorList = new ArrayList<>();

    Connection connection;
    public DoctorServiceImpl() throws SQLException
    {
        connection = DoctorDAO.getConnection();
    }

    //getting the data
    @Override
    public List<Doctor> getAllDoctors() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM doctor");
            ResultSet resultSet = preparedStatement.executeQuery();

            //it will read one by one all raws from the doctor's table
            //we will check this in the broweser to get all doctors data
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
            e.toString(); //to check
        }
        return doctorList;
}


    //converting dto to user
    public Doctor dtoToDoctor(DoctorDTO doctorDTO)
    {
        //this model mapper will automatically convert dto to doctor
        Doctor doctor = this.modelMapper.map(doctorDTO, Doctor.class);
        /*
        doctor.setId_doctor(doctorDTO.getId_doctor());
        doctor.setName(doctorDTO.getName());
        doctor.setSurname(doctorDTO.getSurname());
        doctor.setGender(doctorDTO.getGender());
        doctor.setEmail(doctorDTO.getEmail());
        doctor.setPassword(doctorDTO.getPassword());
        doctor.setSurname(doctorDTO.getSurname());
         */
        return  doctor;
    }

    //converting user to dto
    public DoctorDTO doctorToDto(Doctor doctor)
    {

        //with the model mapper we converted doctor into dto
      DoctorDTO doctorDTO = this.modelMapper.map(doctor, DoctorDTO.class);
      /*
      doctorDTO.setId_doctor(doctor.getId_doctor());
      doctorDTO.setName(doctor.getName());
      doctorDTO.setSurname(doctor.getSurname());
      doctorDTO.setGender(doctor.getGender());
      doctorDTO.setEmail(doctor.getEmail());
      doctorDTO.setPassword(doctor.getPassword());
      doctorDTO.setUsername(doctor.getUsername());
       */
      return  doctorDTO;
    }

}
