package com.fermed.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Doctor {
    //doctor entity
    int id_doctor;
    String name;
    String surname;
    String gender;
    String email;
    String password;
    String username;




@Override
    public String toString(){
        return "Doctor [id_doctor=" + id_doctor + ", name=" + name + ", surname=" + surname + ", gender=" + gender + ", email=" + email + ", passowrd=" + password + ", username=" + username +"]";
    }




}
