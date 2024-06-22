package org.gour.priyanshu.service;

import org.gour.priyanshu.beans.EmployeeDTO;

import java.util.List;

public interface IEmployeeMgmtService {
    public List<EmployeeDTO> fetchEmpByDesg(String desg[]) throws Exception;
}
