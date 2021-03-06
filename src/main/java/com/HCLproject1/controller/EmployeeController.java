//package com.HCLproject1.controller;
//
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.HCLproject1.RequestEntity.Employee;
//import com.HCLproject1.service.EmployeeService;
//
//@RestController
//public class EmployeeController{
//	
//	@Autowired
//	private EmployeeService employeeService;
//
//	
//	@GetMapping(value="getEmp/{id}")
//	public @ResponseBody ResponseEntity<Employee> getEmployees(@PathVariable("id") int id) {
//	 
//		Employee employeeResponse=null;
//		try {
//			
//			System.out.println("id"+id);
//
//		 employeeResponse=employeeService.getEmpById(id);
//		}
//		catch(Exception e)
//		{
//				e.printStackTrace();
//				
//		}
//		return 	new ResponseEntity<Employee>(employeeResponse,HttpStatus.OK);
//		
//	}
//	
//	@GetMapping("/AllEmployees")  
//	public List<Employee> getAllEmployees()   
//	{  
//	return employeeService.getAllEmployees();  
//	}  
//	
//	
//	
//	//creating a get mapping that retrieves the detail of a specific employee
//	
//	@GetMapping("/SingleEmployee/{id}")  
//	public Employee getEmployeeById(@PathVariable("id") int id)   
//	{
//
//		Employee empRes =null;
//		try
//		{
//		
//			empRes =employeeService.getEmpById(id);  
//	}  
//	catch(Exception e)
//		{
//		e.printStackTrace();
//		}
//	return empRes;
//	
//	}
//	//creating a delete mapping that deletes a specified employee  
//	@DeleteMapping("/Delete/{id}")  
//	public void delete(@PathVariable("id") int id)   
//	{  
//		try {
//			
//		
//		employeeService.delete(id);  
//	} catch(Exception e)
//		{
//		e.printStackTrace();
//		}
//	
//	}
//	
//	//creating post mapping that post the employee detail in the database  
//	@PostMapping("/AddEmployee")  
//	public void  saveEmployee(@RequestBody Employee employeeRequestEntity)   
//	{  
//		try {
//		
//      employeeService.saveOrUpdate(employeeRequestEntity);  
//
//	}  catch(Exception e)
//		{
//		e.printStackTrace();
//		}
//	}
//	
//	
//	//creating put mapping that updates the employee detail   
//	@PutMapping("/updateEmployee")  
//	public  Employee update(@RequestBody Employee employeeRequestEntity)   
//	{  
//		try {
//		
//		employeeService.saveOrUpdate(employeeRequestEntity);  
//		}catch(Exception e )
//		{
//			e.printStackTrace();
//			} 
//		return employeeRequestEntity;  
//
//	}
//	
//	
//}