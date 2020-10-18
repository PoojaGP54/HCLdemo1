package com.HCLproject1.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.HCLproject1.Dao.EmployeeDao;
import com.HCLproject1.ResponseEntity.EmployeeResponseEntity;
import com.HCLproject1.service.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
		
	@Override
	public EmployeeResponseEntity getEmployeeService(int id) {
		// TODO Auto-generated method stub
		EmployeeResponseEntity empResponse=null;
		try {
		
		System.out.println("id in service layer"+id);
		
		 empResponse=employeeDao.getSalary(id);

			System.out.println("id in service layer2="+empResponse);
		 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return empResponse;
	}

}
