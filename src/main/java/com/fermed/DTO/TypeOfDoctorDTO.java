package com.fermed.DTO;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class TypeOfDoctorDTO {
    //Using doctorDTO for transfering the data

    int id_type_of_doctor;

    @NotEmpty
    @NotBlank(message = "Doctor Department field should not be empty!!!")
    String nome;

    @NotEmpty
    @NotBlank(message = "Code field should not be empty!!!")
    int  code;

    @NotEmpty
    @NotBlank(message = "Description field should not be empty!!!")
    @Size(min = 20, message ="Description must contain minimum 20 characters!!!")
    @Size(max = 50, message ="Description must contain maximum 50 characters!!!" )
    String  description;
}
