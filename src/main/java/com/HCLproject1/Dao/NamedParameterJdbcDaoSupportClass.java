package com.HCLproject1.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import com.HCLproject1.RequestEntity.Employee;

public class NamedParameterJdbcDaoSupportClass extends NamedParameterJdbcDaoSupport {

	@Autowired
	public void setDataSource3(DataSource dataSource) {
		setDataSource(dataSource);
	}

	

	



}
