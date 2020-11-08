package com.HCLproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(value= {"com.HCLproject1.RequestEntity","com.HCLproject1.ResponseEntity"})
@EnableJpaRepositories("com.HCLproject1.Dao")
@ComponentScan(basePackages= {"com.HCLproject1.controller","com.HCLproject1.Dao","com.HCLproject1.Batch","com.HCLproject1.configuration","com.HCLproject1.service","com.HCLproject1.ServiceImpl"})
public class HCLProject1Application
{
	
	public static void main(String[] args) 
	{
		SpringApplication.run(HCLProject1Application.class, args);
}
}