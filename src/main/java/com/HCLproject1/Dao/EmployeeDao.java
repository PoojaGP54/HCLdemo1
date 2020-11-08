package com.HCLproject1.Dao;

import org.springframework.stereotype.Repository;

import com.HCLproject1.RequestEntity.Employee;

@Repository
public interface EmployeeDao{

public Employee getSalary(int id);

//public EmployeeRequestEntity addEmployee(EmployeeRequestEntity empRequest);

//	
//	@Query(value="SELECT * from employee where id = :id"
//			, nativeQuery = true)
//public 	EmployeeResponseEntity getSalary(@Param("id") int id);


}
