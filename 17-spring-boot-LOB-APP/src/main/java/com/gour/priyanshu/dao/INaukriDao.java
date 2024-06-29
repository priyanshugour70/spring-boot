package com.gour.priyanshu.dao;

import com.gour.priyanshu.beans.Naukri;

public interface INaukriDao {
	public void saveObject(Naukri naukri);
	public Naukri readObject();
}
