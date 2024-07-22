package com.gour.priyanshu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gour.priyanshu.entity.MobileNumber;

public interface IMobileRepository extends JpaRepository<MobileNumber, Long> {

}
