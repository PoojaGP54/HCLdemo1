package com.HCLproject1.service;

import java.util.List;
import java.util.Optional;

import com.HCLproject1.RequestEntity.Employee;

public interface EmployeeService {

   public Employee getEmpById(int id);


	public List<Employee> getAllEmployees();


	public void delete(int id);

	public Employee saveOrUpdate(Employee employeeRequestEntity);
	
}