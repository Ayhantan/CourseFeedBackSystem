package com.webapp.coursefeedbacksystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class CoursefeedbacksystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursefeedbacksystemApplication.class, args);
	}

}
