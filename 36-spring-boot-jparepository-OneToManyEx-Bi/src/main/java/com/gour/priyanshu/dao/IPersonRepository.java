package com.gour.priyanshu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gour.priyanshu.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {

}
