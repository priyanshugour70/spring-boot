package com.gour.priyanshu.service.impl;


import com.gour.priyanshu.exception.EmployeeNotFoundException;
import com.gour.priyanshu.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.gour.priyanshu.repository.IEmployeeRepository;
import com.gour.priyanshu.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeRepository repo;

    @Override
    public void saveRecord(Employee employee) {
        repo.save(employee);
    }

    @Override
    public Page<Employee> displayAllRecords(Pageable pageable) {
        return repo.findAll(pageable);
    }

    @Override
    public void deleteRecord(Integer eid) {
        repo.delete(
                repo.findById(eid).orElseThrow(() -> new EmployeeNotFoundException("record not found for deletion")));
    }

    @Override
    public Employee findEmployee(Integer eid) {
        return repo.findById(eid).get();
    }

}