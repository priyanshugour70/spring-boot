package com.gour.priyanshu.dao;

import java.util.List;

import com.gour.priyanshu.beans.ProductBO;

public interface IProductDao {
	public List<ProductBO> getProductsByName(String prod1,String prod2);
}
