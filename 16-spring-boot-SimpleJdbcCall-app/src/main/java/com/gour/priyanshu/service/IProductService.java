package com.gour.priyanshu.service;

import java.util.List;

import com.gour.priyanshu.beans.ProductDTO;

public interface IProductService {
	public List<ProductDTO> fetchProductsByName(String prod1,String prod2);
}
