package com.gour.priyanshu.dao;

import com.gour.priyanshu.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
