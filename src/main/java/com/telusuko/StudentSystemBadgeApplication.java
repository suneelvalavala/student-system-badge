package com.telusuko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.telusuko")
public class StudentSystemBadgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentSystemBadgeApplication.class, args);
	}

}
