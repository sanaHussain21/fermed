package com.fermed.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.*;

@Data
@Entity
public class Patient {
    int id_patient;


   @NotBlank(message = "Name is must!")
    String name;

    @NotBlank(message = "Surname is must!")
    String surname;


    @NotBlank(message = "Codice fiscale field can't be empty!!!")
    String codice_fiscale;


    int id_insurance;


    @NotBlank(message = "Telephone number field can't be empty!!!")
    String telephone_number;


    @NotBlank(message = "Username field can't be empty!!!")
    String  username;


    @NotBlank(message = "Password field can't be empty!!!")
    @Pattern(regexp = "[1-9] [A-Z] [a-z] [_*+,]")
    String password;

    @NotBlank(message = "Email is must!!!")
    @Email
    String email;

    @Override
    public String toString(){
        return "Doctor [id_patient=" + id_patient + ", name=" + name + ", surname=" + surname + ", codice_fiscale=" + codice_fiscale + ", id_insurance=" + id_insurance + ",  telephone_number=" +telephone_number+ ", username=" + username +",  passowrd=" + password +", email=" + email + "]";
    }

}
