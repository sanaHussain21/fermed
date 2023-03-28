package com.fermed.DTO;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class DoctorLoginDTO {
    //this class is for doctor login
    @NotBlank(message = "Email field should not be empty!!!")
    @Email
    private String email;

    @NotEmpty
    @Size(min = 4, message = "Password must contain minimum 4 characters!!!")
    @Size(max = 15, message = "Password must contain maximum 15 characters!!!")
    @Pattern(regexp = "^(?=.*[-,_]).{4,15}$")
    @NotBlank(message = "Password field should not be empty [Password can contain between these allowed special characters(-,_)]")
    private String password;











    public DoctorLoginDTO(String email, String password) {
        this.email = email;
        this.password = password;

    }

    @Override
    public String toString() {
        return "DoctorLoginDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
