package com.gour.priyanshu.dao;

import org.springframework.data.repository.CrudRepository;

import com.gour.priyanshu.entity.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {

}
