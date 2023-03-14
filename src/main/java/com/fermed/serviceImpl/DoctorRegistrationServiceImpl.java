package com.fermed.serviceImpl;

import com.fermed.DTO.DoctorDTO;
import com.fermed.exception.DoctorFoundException;
import com.fermed.model.Doctor;
import com.fermed.repository.DoctorRepository;
import com.fermed.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorRegistrationServiceImpl implements DoctorService {


    private DoctorRepository doctorRepository;


    @Override
    public Doctor createDoctor(Doctor doctor) throws Exception {
        Doctor local = this.doctorRepository.findByUsername(doctor.getUsername());
            //checking whether the user is already present in the database or not
            if(local != null){
                System.out.println("User is already there!!");
                //throw new UsernameNotFoundException();
                throw new DoctorFoundException();
            }
            else{
                local = this.doctorRepository.save(doctor);
            }
            return local;
            }
        }

