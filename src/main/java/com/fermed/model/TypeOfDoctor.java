package com.fermed.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class TypeOfDoctor {
   int id_type_of_doctor;
   String nome;
    int  code;
   String  description;
}
