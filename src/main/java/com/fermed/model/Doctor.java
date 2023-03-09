package com.fermed.model;

import lombok.Data;

@Data
public class Doctor {
    int id_doctor;
    String name;
    String surname;
    String gender;


    @Override
    public String toString(){
        return "Doctor [id_doctor=" + id_doctor +", name=" + name + ", surname=" + surname +", gender=" + gender + "]";
    }




}
