package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmployeeDao;
import com.app.pojos.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	//dep
	@Autowired
	private EmployeeDao empDao;

	@Override
	public List<Employee> getAllEmps() {
		return empDao.getAllEmps();
	}

	@Override
	public String addEmployee(Employee newEmployee) {
		return empDao.addEmployee(newEmployee);
	}

	@Override
	public List<Employee> getEmpByCompany(String companyName) {
		return empDao.getEmpByCompany(companyName);
	}

	

}
