package com.gour.priyanshu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gour.priyanshu.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

}
