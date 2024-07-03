package com.gour.priyanshu.dao;

import com.gour.priyanshu.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentDao extends CrudRepository<Student, Integer> {
	//C R U D operation methods are autocoming from CrudRepository
}
