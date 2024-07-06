package com.gour.priyanshu.dao;

import com.gour.priyanshu.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

}
