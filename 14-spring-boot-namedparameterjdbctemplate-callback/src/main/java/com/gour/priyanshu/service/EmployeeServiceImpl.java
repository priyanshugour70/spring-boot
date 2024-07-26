package com.gour.priyanshu.service;

import java.util.ArrayList;
import java.util.List;

import com.gour.priyanshu.beans.EmployeeBO;
import com.gour.priyanshu.beans.EmployeeDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gour.priyanshu.dao.IEmployeeDao;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao dao;

	@Override
	public String fetchEmpNameByEno(Integer empNo) {
		return dao.getEmpNameByEno(empNo);
	}

	@Override
	public List<EmployeeDTO> fetchEmployeeDetailsBasedOnDesg(String desg1, String desg2) {

		List<EmployeeBO> listBo = dao.getEmployeeDetailsBasedOnDesg(desg1, desg2);

		ArrayList<EmployeeDTO> listDto = new ArrayList<>();

		listBo.forEach(bo -> {
			EmployeeDTO dto = new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listDto.add(dto);
		});

		return listDto;
	}

	@Override
	public int registerEmployee(EmployeeDTO dto) {
		
		EmployeeBO bo = new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		return dao.saveEmployee(bo);
		
	}

}
