package com.gour.priyanshu.dao;

import java.util.List;

import com.gour.priyanshu.beans.EmployeeBO;

public interface IEmployeeDao {
	public String getEmpNameByEno(Integer empNo);
	public List<EmployeeBO> getEmployeeDetailsBasedOnDesg(String desg1, String desg2);
	public int saveEmployee(EmployeeBO bo);
}
