package com.redhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class RedhouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedhouseApplication.class, args);
	}
}
