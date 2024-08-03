package com.gour.priyanshu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gour.priyanshu.model.Employee;

import java.util.List;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}