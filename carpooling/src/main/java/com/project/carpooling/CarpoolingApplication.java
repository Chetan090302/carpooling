package com.project.carpooling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class CarpoolingApplication
{
	public static void main(String[] args)
	{
		System.out.println(new BCryptPasswordEncoder().encode("9876"));
		SpringApplication.run(CarpoolingApplication.class, args);
	}
}
