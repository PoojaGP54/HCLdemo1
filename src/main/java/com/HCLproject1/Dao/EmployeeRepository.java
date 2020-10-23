package com.HCLproject1.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HCLproject1.RequestEntity.EmployeeRequestEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeRequestEntity, Integer> {



}
