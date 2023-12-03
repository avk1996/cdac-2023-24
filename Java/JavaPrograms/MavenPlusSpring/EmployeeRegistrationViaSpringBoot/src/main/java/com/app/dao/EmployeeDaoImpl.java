package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	//dep : 
	@Autowired //byType OR @PersistenceContext : JPA anno
	private EntityManager mgr;//super i/f of Hibernate Session

	@Override
	public List<Employee> getAllEmps() {
		String jpql = "SELECT e FROM Employee e";
		return mgr.createQuery(jpql,Employee.class).getResultList();
	}

	@Override
	public String addEmployee(Employee newEmployee) {
		mgr.persist(newEmployee);
		return "Employee Added Successfully";
	}

	@Override
	public List<Employee> getEmpByCompany(String companyName) {
		String jpql = "SELECT e FROM Employee e WHERE e.companyName = :cn";
		return mgr.createQuery(jpql,Employee.class).setParameter("cn", companyName).getResultList();
	}

	

}
