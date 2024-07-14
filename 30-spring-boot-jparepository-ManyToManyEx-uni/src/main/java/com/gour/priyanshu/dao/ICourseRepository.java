package com.gour.priyanshu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gour.priyanshu.entity.Course;

public interface ICourseRepository extends JpaRepository<Course, Integer> {

}
