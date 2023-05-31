package com.fermed;

import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Data
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
@ComponentScan("com.fermed")
public class FermedApplication {

	public static void main(String[] args) {
		SpringApplication.run(FermedApplication.class, args);
		System.out.println("Hello Mashal");

	}
	/*
		//creating the modelMapper that converts java bean(pojo) from one representation to another
		@Bean
		public ModelMapper modelMapper(){
			return new ModelMapper();
		}

*/

}
