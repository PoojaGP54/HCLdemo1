package com.HCLproject1.service;

import java.util.List;
import java.util.Optional;

import com.HCLproject1.RequestEntity.EmployeeRequestEntity;
import com.HCLproject1.ResponseEntity.EmployeeResponseEntity;

public interface EmployeeService {

   public EmployeeResponseEntity getEmpById(int id);


	public List<EmployeeRequestEntity> getAllEmployees();


	public void delete(int id);

	public EmployeeRequestEntity saveOrUpdate(EmployeeRequestEntity employeeRequestEntity);
	
}