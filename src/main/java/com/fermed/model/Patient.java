package com.fermed.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.*;

@Data
@Entity
public class Patient {
    int id_patient;


    @NotEmpty
    @Size(min = 4 ,max = 25, message ="Name must contain minimum 4 characters and maximum 25 characters!!!")
    @NotBlank(message = "Name field should not be empty!!!")
    String name;

    @NotEmpty
    @Size(min = 4, message ="Surname must contain minimum 4 characters!!!")
    @NotBlank(message = "Surname field should not be empty!!!")
    String surname;


    @NotEmpty
    @Size(min = 16, max = 16, message ="Codice Fiscale must contain maximum 16 characters!!")
    @NotBlank(message = "Codice fiscale field should not be empty!!!")
    String codice_fiscale;


    int id_insurance;

   //fare comtrollo in caso qualcuno inserisce lettere al poato di numei
    @NotEmpty
    @NotBlank(message = "Telephone number field should not be empty!!!")
    String telephone_number;


    @NotEmpty
    @Size(min = 4, message = "Username must contain minimum 4 characters!!")
    @NotBlank(message = "Username field should not be empty!!!")
    String  username;


    @NotEmpty
    @Size(min = 4 , max = 10, message = "Password must contain minimum 4 characters and maximum 10 characters!!!")
    @NotBlank(message = "Password field should not be empty!!!")
    String password;

    @NotBlank(message = "Email field should not be empty!!!")
    @Email
    String email;

    @Override
    public String toString(){
        return "Doctor [id_patient=" + id_patient + ", name=" + name + ", surname=" + surname + ", codice_fiscale=" + codice_fiscale + ", id_insurance=" + id_insurance + ",  telephone_number=" +telephone_number+ ", username=" + username +",  passowrd=" + password +", email=" + email + "]";
    }

}
