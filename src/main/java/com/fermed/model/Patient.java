package com.fermed.model;

import javax.persistence.Entity;

@Entity
public class Patient {
    int id_patient;
    String name;
    String surname;
    String codice_fiscale;
    int id_insurance;
    String  username;
    String password;
    String email;

    @Override
    public String toString(){
        return "Doctor [id_patient=" + id_patient + ", name=" + name + ", surname=" + surname + ", codice_fiscale=" + codice_fiscale + ", id_insurance=" + id_insurance + ", username=" + username +",  passowrd=" + password +", email=" + email + "]";
    }

}
