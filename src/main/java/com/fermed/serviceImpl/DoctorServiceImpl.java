package com.fermed.serviceImpl;

import com.fermed.model.Doctor;
import com.fermed.services.DoctorService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class DoctorServiceImpl  implements DoctorService {

    @Override
    public Doctor createDoctor(Doctor doctor) {
        return null;
    }

    @Override
    public Doctor getDoctorById(Integer id_doctor) {
        return null;
    }

    //list a store form database
    @Autowired
    static List<Doctor> doctorlist = new ArrayList<>();


    @Override
    public List<Doctor> getDoctorData() {
        return null;
    }
}
