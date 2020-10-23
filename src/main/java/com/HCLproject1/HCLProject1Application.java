package com.HCLproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.HCLproject1.Dao.EmployeeDao;
import com.HCLproject1.Dao.EmployeeRepository;
import com.HCLproject1.service.EmployeeService;


@SpringBootApplication
@ComponentScan(basePackages= {"com.HCLproject1.*"})
public class HCLProject1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(HCLProject1Application.class, args);
		}

}
