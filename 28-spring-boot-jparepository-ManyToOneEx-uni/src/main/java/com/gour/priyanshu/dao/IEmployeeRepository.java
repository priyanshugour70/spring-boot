package com.gour.priyanshu.dao;

import com.gour.priyanshu.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
