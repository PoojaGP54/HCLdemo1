package com.HCLproject1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.HCLproject1.ResponseEntity.EmployeeResponseEntity;
import com.HCLproject1.service.EmployeeService;

@RestController
public class EmployeeController{
	
	@Autowired
	private EmployeeService employeeService;

	
	@GetMapping(value="getEmp/{id}")
	public @ResponseBody ResponseEntity<EmployeeResponseEntity> getEmployees(@PathVariable("id") int id) {
	 
		EmployeeResponseEntity employeeResponse=null;
		try {
			
			System.out.println("id"+id);

		 employeeResponse=employeeService.getEmployeeService(id);
		}
		catch(Exception e)
		{
				e.printStackTrace();
				
		}
		return 	new ResponseEntity<EmployeeResponseEntity>(employeeResponse,HttpStatus.OK);
		
	}
}
