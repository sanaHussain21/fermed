package com.fermed;

import com.fermed.facades.DoctorFacade;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Data
@SpringBootApplication
public class FermedApplication {

	public static void main(String[] args) {
		SpringApplication.run(FermedApplication.class, args);
		System.out.println("Hello Papa");

		DoctorFacade doctorFacade = new DoctorFacade();
		System.out.println("Calling doctorFacade from main"+ doctorFacade);
	}


}
