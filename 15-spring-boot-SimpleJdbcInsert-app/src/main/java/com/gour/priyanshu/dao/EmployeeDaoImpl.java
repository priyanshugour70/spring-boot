package com.gour.priyanshu.dao;

import com.gour.priyanshu.beans.EmployeeBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmployeeDaoImpl implements IEmployeeDAO {

	@Autowired
	private SimpleJdbcInsert sji;

	@Override
	public int saveEmployee(EmployeeBO bo) {

		// set the table name
		sji.setTableName("employee");

		// binding the column name with property names
		BeanPropertySqlParameterSource paramResource = new BeanPropertySqlParameterSource(bo);

		// insert query generated dynamically and executes
		return sji.execute(paramResource);
	}
}

