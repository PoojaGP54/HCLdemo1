package com.HCLproject1.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HCLproject1.RequestEntity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}
