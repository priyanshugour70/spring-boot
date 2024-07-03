package com.gour.priyanshu.dao;

import com.gour.priyanshu.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {

}
