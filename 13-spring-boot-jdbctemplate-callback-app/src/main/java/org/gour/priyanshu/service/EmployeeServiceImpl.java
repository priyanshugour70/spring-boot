package org.gour.priyanshu.service;

import java.util.ArrayList;
import java.util.List;

import org.gour.priyanshu.beans.EmployeeBO;
import org.gour.priyanshu.beans.EmployeeDTO;
import org.gour.priyanshu.dao.IEmployeeDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao dao;

	@Override
	public EmployeeDTO fetchEmployeeByNo(Integer empNo) {
		EmployeeBO bo = dao.getEmployeeByNo(empNo);
		EmployeeDTO dto = new EmployeeDTO();
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

	@Override
	public List<EmployeeDTO> fetchEmployeeByDesg(String desg1, String desg2) {

		List<EmployeeBO> listBo = dao.getEmployeeByDesg(desg1, desg2);

		ArrayList<EmployeeDTO> listDto = new ArrayList<>();

		listBo.forEach(bo -> {
			EmployeeDTO dto = new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listDto.add(dto);
		});

		return listDto;
	}

	@Override
	public List<EmployeeDTO> fetchAllEmployees() {
		
		List<EmployeeBO> listBo = dao.getAllEmployees();

		ArrayList<EmployeeDTO> listDto = new ArrayList<>();

		listBo.forEach(bo -> {
			EmployeeDTO dto = new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listDto.add(dto);
		});

		return listDto;
	}

}
