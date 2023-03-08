package com.fermed;

import com.fermed.controllers.Doctor;
import com.fermed.facades.DoctorFacade;
import com.fermed.services.DoctorService;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Data
@SpringBootApplication
public class FermedApplication {

	public static void main(String[] args) {
		SpringApplication.run(FermedApplication.class, args);
		System.out.println("Hello Papa");


	}


}
