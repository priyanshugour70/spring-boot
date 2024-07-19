package com.gour.priyanshu.service;

import java.util.List;

import com.gour.priyanshu.entity.Employee;

public interface IEmployeeService {
	public  List<Employee>  searchEmpsByDesgs(String desg1, String desg2);
}
