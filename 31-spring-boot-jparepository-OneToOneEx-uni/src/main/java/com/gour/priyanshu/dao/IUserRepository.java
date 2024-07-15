package com.gour.priyanshu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gour.priyanshu.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
