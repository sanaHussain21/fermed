package com.fermed.DTO;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Data
public class DoctorDTO {
    //for trasfering the data

    private int id_doctor;

    @NotEmpty
    @Size(message = "Name field can't be empty!!!")
    private String name;

    @NotEmpty
    @Size(message = "Surname field can't be empyty!!!")
    private String surname;

    @NotNull
    private String gender;

    @NotEmpty
    @Email(message = "Email field mustn't be empty!!!")
    private String email;

    @NotEmpty
    @Size(min =4, max = 10, message = "Password must be minimun 4 and maximun 10 charactters long!!!")
    @Pattern(regexp = "[1-9] [A-Z] [a-z] [_*+,]")
    private String password;

    @NotEmpty
    @Size(min = 3, message = "The username must contain min 3 characters!!!")
    private String username;
}
