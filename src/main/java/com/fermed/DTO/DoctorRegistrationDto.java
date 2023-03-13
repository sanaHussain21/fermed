package com.fermed.DTO;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class DoctorRegistrationDto {

    @NotEmpty
    @Size(message = "Doctor Name field can't be empty!!!")
    String name;

    @NotEmpty
    @Size(message = "Doctor Surname field can't be empyty!!!")
    String surname;

    @NotEmpty
    @Size(message = "Gender must be specifed!!!")
    String gender;

    @NotEmpty
    @Email(message = "Email field mustn't be empty!!!")
    String email;

    @NotEmpty
    @Size(min =4, max = 10, message = "Password must be minimun 4 and maximun 10 charactters long!!!")
    @Pattern(regexp = "[1-9] [A-Z] [a-z] [_*+,]")
    String password;

    @NotEmpty
    @Size(min = 3, message = "The username must contain min 3 characters!!!")
    String username;
}
