package com.HCLproject1.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.HCLproject1.Dao.EmployeeDao;
import com.HCLproject1.Dao.EmployeeRepository;
import com.HCLproject1.RequestEntity.Employee;
import com.HCLproject1.service.EmployeeService;

@Component
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	
		
	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		Employee empResponse=null;
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


	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> emp = new ArrayList<Employee>();  
       return	employeeRepo.findAll();  
 
		}  
	
	public void delete(int id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
	}



	public Employee saveOrUpdate(Employee employeeRequestEntity) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employeeRequestEntity);
	}





}
