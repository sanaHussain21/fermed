package com.fermed.DTO;

import javax.validation.constraints.*;

public class PatientDTO {

    int id_patient;


    @NotEmpty
    @Size(min = 4, message ="Name must contain minimum 4 characters!!!")
    @Size(max = 10, message ="Name must contain maximum 10 characters!!!" )
    @NotBlank(message = "Name field should not be empty!!!")
    String name;

    @NotEmpty
    @Size(min = 4, message ="Surname must contain minimum 4 characters!!!")
    @Size(max = 10, message ="Surname must contain maximum 10 characters!!!" )
    @NotBlank(message = "Surname field should not be empty!!!")
    String surname;


    @NotEmpty
    @Size(min = 16, max = 16, message ="Codice Fiscale must contain maximum 16 characters!!")
    @NotBlank(message = "Codice fiscale field should not be empty!!!")
    String codice_fiscale;


    int id_insurance;

    //fare comtrollo in caso qualcuno inserisce lettere al poato di numei
    @NotEmpty
    @Pattern(regexp="(^$|[0-9]{10})")
    @NotBlank(message = "Telephone number field should not be empty!!!")
    String telephone_number;


    @NotEmpty
    @Size(min = 4, message = "Username must contain minimum 4 characters!!!")
    @Size(max = 15, message = "Username must contain maximum 15 characters!!!")
    @NotBlank(message = "Username field should not be empty!!!")
    String  username;


    @NotEmpty
    @Size(min = 4, message = "Password must contain minimum 4 characters!!!")
    @Size(max = 15, message = "Password must contain maximum 15 characters!!!")
    @Pattern(regexp = "^(?=.*[-,_]).{4,15}$")
    @NotBlank(message = "Password field should not be empty [Password can contain between these allowed special characters(-,_)]")
    String password;

    @NotBlank(message = "Email field should not be empty!!!")
    @Email
    String email;

}
