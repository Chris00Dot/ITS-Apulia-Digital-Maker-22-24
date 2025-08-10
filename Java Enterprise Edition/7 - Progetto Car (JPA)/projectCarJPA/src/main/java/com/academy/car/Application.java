package com.academy.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.academy.car.process.VeicoloProcess;

@SpringBootApplication
public class Application 
{
	@Autowired
	private VeicoloProcess vP;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner()
	{
		return args -> 
		{
			vP.execute();
		};
	}
}