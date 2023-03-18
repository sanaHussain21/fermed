package com.fermed.DTO;

import lombok.Data;


import javax.validation.constraints.*;

@Data
public class DoctorDTO {
    //Using doctorDTOfor trasfering the data

    private int id_doctor;

    @NotEmpty
    @Size(min = 4, message ="Name must contain minimum 4 characters!!!")
    @Size(max = 10, message ="Name must contain maximum 10 characters!!!" )
    @NotBlank(message = "Name field should not be empty!!!")
    private String name;

    @NotEmpty
    @Size(min = 4, message ="Surname must contain minimum 4 characters!!!")
    @Size(max = 15, message ="Surname must contain maximum 15 characters!!!" )
    @NotBlank(message = "Surname field should not be empty!!!")
    private String surname;

    @NotEmpty
    @NotBlank(message = "Gender field should not be empty!!!")
    private String gender;


    @NotBlank(message = "Email field should not be empty!!!")
    @Email
    private String email;

    @NotEmpty
    @Size(min = 4, message = "Password must contain minimum 4 characters!!!")
    @Size(max = 15, message = "Password must contain maximum 15 characters!!!")
    @Pattern(regexp = "^(?=.*[-,_]).{4,15}$")
    @NotBlank(message = "Password field should not be empty [Password can contain between these allowed special characters(-,_)]")
    private String password;

    @NotEmpty
    @Size(min = 4, message = "Username must contain minimum 4 characters!!!")
    @Size(max = 15, message = "Username must contain maximum 15 characters!!!")
    @NotBlank(message = "Username field should not be empty!!!")
    private String username;
}
