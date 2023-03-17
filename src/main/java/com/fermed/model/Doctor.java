package com.fermed.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.*;

@Data
@Entity
public class Doctor {
    //doctor entity
    int id_doctor;


    @NotEmpty
    @Size(min = 4, message ="Name must contain minimum 4 characters!!!")
    @Size(max = 10, message ="Name must contain maximum 10 characters!!!" )
    @NotBlank(message = "Name field should not be empty!!!")
    String name;



    @NotEmpty
    @Size(min = 4, message ="Surname must contain minimum 4 characters!!!")
    @Size(max = 15, message ="Surname must contain maximum 15 characters!!!" )
    @NotBlank(message = "Surname field should not be empty!!!")
    String surname;


    @NotEmpty
    @NotBlank(message = "Gender field should not be empty!!!")
    String gender;

    int id_type_of_doctor;
    int insurance_id_insurance;



    @NotBlank(message = "Email field should not be empty!!!")
    @Email
    String email;


    @NotEmpty
    @Size(min = 4, message = "Password must contain minimum 4 characters!!!")
    @Size(max = 15, message = "Password must contain maximum 15 characters!!!")
    @Pattern(regexp = "^(?=.*[-,_]).{4,15}$")
    @NotBlank(message = "Password field should not be empty [Password can contain between these allowed special characters(-,_)]")
    String password;


    @NotEmpty
    @Size(min = 4, message = "Username must contain minimum 4 characters!!!")
    @Size(max = 15, message = "Username must contain maximum 15 characters!!!")
    @NotBlank(message = "Username field should not be empty!!!")
    String username;





@Override
    public String toString(){
        return "Doctor [id_doctor=" + id_doctor + ", name=" + name + ", surname=" + surname + ", gender=" + gender + ", id_type_of_doctor=" + id_type_of_doctor + ", insurance_id_insurance=" + insurance_id_insurance + ", email=" + email + ", passowrd=" + password + ", username=" + username +"]";
    }




}
