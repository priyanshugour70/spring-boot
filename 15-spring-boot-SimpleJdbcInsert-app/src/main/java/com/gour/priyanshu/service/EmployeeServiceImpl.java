package com.gour.priyanshu.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gour.priyanshu.beans.EmployeeBO;
import com.gour.priyanshu.beans.EmployeeDTO;
import com.gour.priyanshu.dao.IEmployeeDAO;

@Service("service")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO dao;

	@Override
	public int registerEmployee(EmployeeDTO dto) {
		EmployeeBO bo = new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		return dao.saveEmployee(bo);
	}

}
