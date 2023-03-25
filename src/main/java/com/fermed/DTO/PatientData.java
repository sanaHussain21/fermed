package com.fermed.DTO;

import lombok.Data;

@Data
public class PatientData {

    private  int id_patient;
    private  String name;
    private String surname;
    private String codice_fiscale;
    private int id_insurance = 1;
    private String telephone_number;
    private String  username;
    private  String password;
    private String email;
}
