package com.gour.priyanshu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gour.priyanshu.entity.Product;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
