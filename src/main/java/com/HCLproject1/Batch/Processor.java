package com.HCLproject1.Batch;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.HCLproject1.RequestEntity.Employee;

@Component
public class Processor implements ItemProcessor<Employee, Employee> {

    private static final Map<String, String> DEPT_NAMES =
            new HashMap<>();

    public Processor() {
        DEPT_NAMES.put("11", "Technology");
        DEPT_NAMES.put("22", "Operations");
        DEPT_NAMES.put("33", "Accounts");
        DEPT_NAMES.put("44", "Finance");
        
    }

    @Override
    public Employee process(Employee employee) throws Exception {
    	 String deptCode = employee.getDept();
         String dept = DEPT_NAMES.get(deptCode);
         employee.setDept(dept);
         employee.setTime(new Date());
         System.out.println(String.format("Converted from [%s] to [%s]", deptCode, dept));
         return employee;
    }

	
}