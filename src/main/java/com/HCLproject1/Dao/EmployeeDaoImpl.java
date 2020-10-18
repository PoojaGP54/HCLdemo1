package com.HCLproject1.Dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.HCLproject1.ResponseEntity.EmployeeResponseEntity;

@Repository
public class EmployeeDaoImpl  extends NamedParameterJdbcDaoSupportClass implements EmployeeDao{

	@Override
	public EmployeeResponseEntity getSalary(int id) {
		// TODO Auto-generated method stub
		EmployeeResponseEntity result=  null;
		try {
			String query = "select * from employee where  id = '"+id+"'";
System.out.println("in dao layer"+id);
			 result=  getNamedParameterJdbcTemplate().getJdbcOperations().queryForObject(query,
					new BeanPropertyRowMapper<EmployeeResponseEntity>(EmployeeResponseEntity.class));
			System.out.println(result);

		} catch (Exception ex) {

			
			ex.printStackTrace();
		}
		return result;

	}


}
