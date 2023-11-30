package com.app.core;

import java.time.LocalDate;

public class Customer implements Comparable<Customer>{
	private static int customerId = 0;

	public static int getCustomerId() {
		return customerId;
	}

	public static void setCustomerId(int customerId) {
		Customer.customerId = customerId;
	}

	private String customerFirstName, customerLastName;
	private String customerEmail, customerPassword;
	private double customerRegistationAmount;
	private LocalDate dateOfBirth;
	private ServicePlan plan;

//I will create a constructor to accept customer details
	public Customer(String customerFirstName, String customerLastName, String customerEmail, String customerPassword,
			double customerRegistationAmount, LocalDate dateOfBirth, ServicePlan plan) {
		super();
		++customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
		this.customerRegistationAmount = customerRegistationAmount;
		this.dateOfBirth = dateOfBirth;
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "Customer [" + "Customer ID: " + customerId + " customerFirstName=" + customerFirstName
				+ ", customerLastName=" + customerLastName + ", customerEmail=" + customerEmail + ", customerPassword="
				+ customerPassword + ", customerRegistationAmount=" + customerRegistationAmount + ", dateOfBirth="
				+ dateOfBirth + ", plan=" + plan + "]";
	}

	public Customer(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Override
	public boolean equals(Object refObj) {
		System.out.println("In equals method...");
		if (refObj instanceof Customer) {
			Customer anotherCustomer = (Customer) refObj;
			return this.customerEmail.equals(anotherCustomer.customerEmail);
		}
		return false;
	}

//	@Override
	//sorting by email
	public int compareTo(Customer anotherCustomer) {
		System.out.println("in compareto method...");
		return this.getCustomerEmail().compareTo(anotherCustomer.getCustomerEmail());
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public double getCustomerRegistationAmount() {
		return customerRegistationAmount;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
}
