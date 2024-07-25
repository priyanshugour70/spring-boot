package org.gour.priyanshu.dao;

import java.util.List;

import org.gour.priyanshu.beans.EmployeeBO;

public interface IEmployeeDao {
	public EmployeeBO getEmployeeByNo(Integer empNo);
	public List<EmployeeBO> getEmployeeByDesg(String desg1,String desg2);
	public List<EmployeeBO> getAllEmployees();
}
