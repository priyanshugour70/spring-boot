package com.gour.priyanshu.runner;

import com.gour.priyanshu.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private IProductService service;

	@Override
	public void run(String... args) throws Exception {

		service.fetchProductsByName("fossil", "armani").forEach(System.out::println);

	}
}
