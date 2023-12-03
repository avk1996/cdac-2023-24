package com.app.service;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeService {
	List<Employee> getAllEmps();
	String addEmployee(Employee newEmployee);
	List<Employee> getEmpByCompany(String companyName);
}
