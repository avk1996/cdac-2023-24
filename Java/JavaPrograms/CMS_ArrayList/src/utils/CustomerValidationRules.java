package utils;

import com.app.core.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import custom_exception.CustomerHandlingException;

public class CustomerValidationRules {
	public static Customer validateEmail(String customerEmail, List<Customer> customer)
			throws CustomerHandlingException {
		Customer anotherCustomer = new Customer(customerEmail);
		if (customer.contains(anotherCustomer)) {
			throw new CustomerHandlingException("DENIED: enter new info...");
		}
		return anotherCustomer;
	}

	public static Customer authenticateCustomer(String customerEmail, String customerPassword, List<Customer> customers)
			throws CustomerHandlingException {
		Customer anotherCustomer = new Customer(customerEmail);
		int index = customers.indexOf(anotherCustomer);
		if (index == -1) {
			throw new CustomerHandlingException("Invalid email");
		}
		// valid index
		Customer authEmail = customers.get(index);
		if (!authEmail.getCustomerPassword().equals(customerPassword)) {
			throw new CustomerHandlingException("Invalid password");
		}
		return authEmail;
	}

	public static void resetCustomerPassword(String customerEmail, String oldPassword, String newPassword,
			List<Customer> customers) throws CustomerHandlingException {
		Customer authCust = authenticateCustomer(customerEmail, oldPassword, customers);
		authCust.setCustomerPassword(newPassword);
	}

	public static void unsuscribeCustomer(String customerEmail, String customerPassword, List<Customer> customers)
			throws CustomerHandlingException {
		Customer removeCust = authenticateCustomer(customerEmail, customerPassword, customers);
		customers.remove(removeCust);
	}

	public static ServicePlan validatePlan(String plan) throws IllegalArgumentException {
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	public static void validateRegistrationAmount(double customerRegistrationAmount, ServicePlan plan)
			throws CustomerHandlingException {
		if (customerRegistrationAmount != plan.getCharges()) {
			throw new CustomerHandlingException("DENIED: Amount did not match...");
		}
	}

	public static LocalDate validateAge(LocalDate newDate) throws CustomerHandlingException {
		LocalDate currentDate = LocalDate.now();
		if (Period.between(newDate, currentDate).getYears() < 20)
			throw new CustomerHandlingException("DENIED:Must be above age 20 yrs...");
		return null;
	}

	public static Customer validateCustomerInfo(String customerFirstName, String customerLastName, String customerEmail,
			String customerPassword, double customerRegistationAmount, String dateOfBirth, String plan,
			List<Customer> customerList) throws CustomerHandlingException {
		// parsing date as string
		LocalDate newDate = LocalDate.parse(dateOfBirth);
		validateAge(newDate);
		validateEmail(customerEmail, customerList);
		ServicePlan newPlan = validatePlan(plan);
		validateRegistrationAmount(customerRegistationAmount,newPlan);
		return new Customer(customerFirstName, customerLastName, customerEmail, customerPassword,
				customerRegistationAmount, newDate, newPlan);
	}
}