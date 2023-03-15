package com.fermed.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Patient {
    int id_patient;
    String name;
    String surname;
    String codice_fiscale;
    int id_insurance;
    String telephone_number;
    String  username;
    String password;
    String email;

    @Override
    public String toString(){
        return "Doctor [id_patient=" + id_patient + ", name=" + name + ", surname=" + surname + ", codice_fiscale=" + codice_fiscale + ", id_insurance=" + id_insurance + ",  telephone_number=" +telephone_number+ ", username=" + username +",  passowrd=" + password +", email=" + email + "]";
    }

}
