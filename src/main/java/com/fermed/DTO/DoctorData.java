package com.fermed.DTO;

import lombok.Data;

@Data
public class DoctorData {
    private int id_doctor;
    private String name;
    private String surname;
    private String gender;
    int id_type_of_doctor;
    int insurance_id_insurance;
    private String email;
    private String password;
    private String username;
}
