package com.fermed.services;

import com.fermed.DTO.DoctorDTO;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface HomeService {

    List<DoctorDTO> getAllDoctors();

}
