package org.gour.priyanshu.dao;

import org.gour.priyanshu.beans.EmployeeBO;

import java.util.List;

public interface IEmployeeDao {
    public List<EmployeeBO> fetchEmpByDesg(String cond) throws Exception;
}
