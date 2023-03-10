package com.fermed.DTO;

import lombok.Data;

@Data
public class DoctorDTO {
    //for trasfering the data

    private int id_doctor;
    private String name;
    private String surname;
    private String gender;
    private String email;
    private String password;
    private String username;
}
