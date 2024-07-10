package com.gour.priyanshu.runner;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.gour.priyanshu.dao.IProductRepository;
import com.gour.priyanshu.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private IProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		Product pob = new Product();
		
		pob.setProdId(10);
		pob.setProdCode("PEN");

		pob.setColors(Arrays.asList("RE", "GR", "BL"));

		Set<String> set = new LinkedHashSet<>();
		set.add("M1");
		set.add("LA");
		set.add("SF");

		pob.setModels(set);

		Map<String, String> map = new LinkedHashMap<>();
		map.put("D1", "ABC");
		map.put("D2", "XYZ");

		pob.setDetails(map);

		repo.save(pob);

	}
}
