package com.fermed.model;


import lombok.Data;

import javax.persistence.Entity;


@Data
@Entity
public class Doctor {
    //doctor entity, using lombok

    int id_doctor;
    String name;
    String surname;
    String gender;
    int id_type_of_doctor;
    int insurance_id_insurance;
    String email;
    String password;
    String username;





@Override
    public String toString(){
        return "Doctor [id_doctor=" + id_doctor + ", name=" + name + ", surname=" + surname + ", gender=" + gender + ", id_type_of_doctor=" + id_type_of_doctor + ", insurance_id_insurance=" + insurance_id_insurance + ", email=" + email + ", passowrd=" + password + ", username=" + username +"]";
    }




}
