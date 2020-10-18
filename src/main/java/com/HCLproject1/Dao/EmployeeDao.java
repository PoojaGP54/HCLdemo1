package com.HCLproject1.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.HCLproject1.RequestEntity.EmployeeRequestEntity;
import com.HCLproject1.ResponseEntity.EmployeeResponseEntity;

@Repository
public interface EmployeeDao{

public EmployeeResponseEntity getSalary(int id);

//	
//	@Query(value="SELECT * from employee where id = :id"
//			, nativeQuery = true)
//public 	EmployeeResponseEntity getSalary(@Param("id") int id);


}
