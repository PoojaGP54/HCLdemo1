package com.HCLproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages= {"com.HCLproject1","com.HCLproject1.controller","com.HCLproject1.RequestEntity","com.HCLproject1.ResponseEntity","com.HCLproject1.Service","com.HCLproject1.ServiceImpl","com.HCLproject1.Dao"})
@EnableJpaRepositories("com.HCLproject1.Dao")

public class HcLProject1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(HcLProject1Application.class, args);
	}

}
