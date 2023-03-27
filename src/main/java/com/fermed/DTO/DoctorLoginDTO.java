package com.fermed.DTO;

import lombok.Data;

@Data
public class DoctorLoginDTO {
    //this class is for doctor login
    private String email;
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
