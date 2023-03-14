package com.fermed;

import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Data


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class FermedApplication {

	public static void main(String[] args) {
		SpringApplication.run(FermedApplication.class, args);
		System.out.println("Hello Mashal");

	}
		//creating the modelMapper that converts java bean(pojo) from one representation to another
		@Bean
		public ModelMapper modelMapper(){
			return new ModelMapper();
		}



}
