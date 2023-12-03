package com.app.dao;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmps();
	String addEmployee(Employee newEmployee);
	List<Employee> getEmpByCompany(String companyName);
}
