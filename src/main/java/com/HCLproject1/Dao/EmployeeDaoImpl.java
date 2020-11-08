package com.HCLproject1.Dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.HCLproject1.RequestEntity.Employee;

@Repository
public class EmployeeDaoImpl  extends NamedParameterJdbcDaoSupportClass implements EmployeeDao{

	public Employee getSalary(int id) {
		// TODO Auto-generated method stub
		Employee result=  null;
		try {
			String query = "select * from employee where  id = '"+id+"'";
System.out.println("in dao layer"+id);
			 result=  getNamedParameterJdbcTemplate().getJdbcOperations().queryForObject(query,
					new BeanPropertyRowMapper<Employee>(Employee.class));
			System.out.println(result);

		} catch (Exception ex) {

			
			ex.printStackTrace();
		}
		return result;

	}

//	@Override
//	public EmployeeRequestEntity addEmployee(EmployeeRequestEntity empRequest) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//

}
