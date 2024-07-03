package com.gour.priyanshu.dao;

import com.gour.priyanshu.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IEmployeePagingSortingRepository extends PagingAndSortingRepository<Employee, Integer> {
	
}
