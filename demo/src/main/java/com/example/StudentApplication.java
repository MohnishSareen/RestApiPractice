package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@SpringBootApplication
public class StudentApplication {
	// Comments in Spring Main File
	private static final Logger logger = LoggerFactory.getLogger(StudentApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(StudentRepository sRep) {
		return (args) -> {
			sRep.save(new Student("Mohnish Sareen", "Brampton"));
			sRep.save(new Student("Sitanshu Badhwar", "Scarborough"));
			sRep.save(new Student("Khushpreet Singh", "Brampton"));
			logger.info("The sample data has been generated");
		};
	}

}
