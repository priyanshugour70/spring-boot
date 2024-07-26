package com.gour.priyanshu.runner;

import java.util.Arrays;

import com.gour.priyanshu.dao.IProductRepository;
import com.gour.priyanshu.entity.Model;
import com.gour.priyanshu.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gour.priyanshu.dao.IModelRepository;

@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private IModelRepository mrepo;
	
	@Autowired
	private IProductRepository prepo;
	
	@Override
	public void run(String... args) throws Exception {
		Model m1 = new Model(1012, "XYZ-A", "4GB-128GB-RED");
		Model m2 = new Model(1013, "XYZ-B", "6GB-256GB-GREEN");
		Model m3 = new Model(1014, "MN-C", "12GB-512GB-PINK");
		Model m4 = new Model(1011, "MN-D", "2GB-64GB-BLACK");
		
		Product p1 = new Product(10, "ABCD-XYZ", Arrays.asList(m1,m2));
		Product p2 = new Product(11, "ABCD-MN", Arrays.asList(m3,m4));
		
		mrepo.save(m1);
		mrepo.save(m2);
		mrepo.save(m3);
		mrepo.save(m4);
		
		prepo.save(p1);
		prepo.save(p2);	
		
	}
}
