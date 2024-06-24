package com.gour.priyanshu.service;

import java.util.List;

import com.gour.priyanshu.beans.EmployeeDTO;

public interface IEmployeeService {
	public String fetchEmpNameByEno(Integer empNo);
	public List<EmployeeDTO> fetchEmployeeDetailsBasedOnDesg(String desg1, String desg2);
	public int registerEmployee(EmployeeDTO dto);
}
