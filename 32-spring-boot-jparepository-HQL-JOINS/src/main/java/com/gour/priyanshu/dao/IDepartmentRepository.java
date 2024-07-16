package com.gour.priyanshu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gour.priyanshu.entity.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

}
