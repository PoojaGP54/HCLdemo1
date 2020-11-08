package com.HCLproject1;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import com.HCLproject1.Dao.EmployeeDao;
import com.HCLproject1.Dao.EmployeeRepository;
import com.HCLproject1.RequestEntity.Employee;
import com.HCLproject1.service.EmployeeService;

public class EmployeeTest {

	
	EmployeeService service =Mockito.mock(EmployeeService.class);
	EmployeeDao empDao= Mockito.mock(EmployeeDao.class);
	EmployeeRepository employeeRepo=Mockito.mock(EmployeeRepository.class);
	
//	@BeforeEach
//	void setUp() throws Exception {
//	
//	}

	@Test
	public void test() {
		
		List<Employee> empRes=new ArrayList<Employee>();
		empRes= employeeRepo.findAll();
				
	     when(employeeRepo.findAll()).thenReturn(empRes);
	     assertEquals(empRes,service.getAllEmployees());
	     
	}
	

}