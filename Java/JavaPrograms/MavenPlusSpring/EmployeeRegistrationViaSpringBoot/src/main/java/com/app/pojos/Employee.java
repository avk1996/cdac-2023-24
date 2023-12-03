package com.app.pojos;
/*
 * emp_id(PK) ,first_name,last_name,email(unique)
password(not null),join_date,emp_type(full_time/part_time/contract...:enum),salary


 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // mandatory
@Table(name = "emps")
public class Employee{
	//1. emp no2. first name3. last name4. city 5. company name
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_id")
	private Integer empId;
	@Column(name="first_name",length = 30)//varchar(30)
	private String firstName;
	@Column(name="last_name",length = 30)//varchar(30)
	private String lastName;
	@Column(length=30)
	private String city;
	@Column(name="company_name",length= 30)
	private String companyName;

	public Employee() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getEmpId() {
		return empId;
	}
	
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Employee(String firstName, String lastName, String city, String companyName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
				+ ", companyName=" + companyName + "]";
	}


	
}
