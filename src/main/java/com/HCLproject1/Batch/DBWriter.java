package com.HCLproject1.Batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.HCLproject1.Dao.EmployeeRepository;
import com.HCLproject1.RequestEntity.Employee;
@Component
public class DBWriter implements ItemWriter<Employee> {

	
	@Autowired
	private EmployeeRepository employeeRepository;

	
	@Override
	public void write(List<? extends Employee> employee) throws Exception {
		// TODO Auto-generated method stub
		
		employeeRepository.saveAll(employee);
		
	}

}
