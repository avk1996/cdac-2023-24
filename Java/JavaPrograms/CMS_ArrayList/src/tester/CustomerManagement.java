package tester;

import java.util.Scanner;
import com.app.core.Customer;

import custom_ordering.CustomerEmailOrdering;
import utils.PopulateCustomers;

import java.util.Collections;
import java.util.List;

import static utils.CustomerValidationRules.*;

public class CustomerManagement {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create a empty ArrayList to store customer information
			// initial capacity is 10
			List<Customer> customerList = PopulateCustomers.listReturn();
			boolean exit = false;
			while (!exit) {
				// we will write a try block to throw a exceptions when entering data into
				// records
				// options:
				System.out.println("1. Sign up (Customer registration)\n" + "2. Sign in (Enter email & password\n"
						+ "3. Change password (Enter email old and new password)\n"
						+ "4. Un-suscribe customer (Enter customer email)\n" + "5. Display all customer informaton\n"
						+ "6. Sort customer by email\n" + "7. Sort by customer DOB and last name\n" + "0. EXIT");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter customer details: ");
						Customer validateCustomer = validateCustomerInfo(sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(), customerList);

						customerList.add(validateCustomer);

						break;
					case 2:
						System.out.println("Enter email and password to sign in");
						Customer authenticateCustomer = authenticateCustomer(sc.next(), sc.next(), customerList);
						System.out.println("Access granted: \nDetails: " + authenticateCustomer);
						break;
					case 3:
						System.out.println("Sign in: (Email, old password, new password) ");
						resetCustomerPassword(sc.next(), sc.next(), sc.next(), customerList);
						System.out.println("Reset successful...");
						break;
					case 4:
						System.out.println("Are you really leaving: (yes/no) ");
						String validation = sc.next();
						if (validation.equalsIgnoreCase("yes") || validation.equalsIgnoreCase("y")) {
							System.out.println("Sign in: (Email,password) :)");
							unsuscribeCustomer(sc.next(), sc.next(), customerList);
							System.out.println("Unsuscriptions succesful...:(");
						} else if (validation.equalsIgnoreCase("no") || validation.equalsIgnoreCase("n"))
							System.out.println("Thank you for staying with us...:)");
						else {
							System.out.println("Enter valid option...");
						}
						break;
					case 5:
						System.out.println("Display all customer: ");
						for (Customer cust : customerList) {
							System.out.println(cust);
						}
						break;
					case 6:
						System.out.println("Sort customers as per Id: ");
						Collections.sort(customerList);
						for (Customer cust : customerList) {
							System.out.println(cust);
						}
						break;
					case 7:
						System.out.println("Sort by customer's date of birth and last name");
						Collections.sort(customerList, new CustomerEmailOrdering());
						for (Customer cust : customerList) {
							System.out.println(cust);
						}
					case 0:
						exit = true;
						break;
					default:
						System.out.println("Invalid input...try again");
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.getStackTrace();
					sc.nextLine();
				}
			}

		} // sc.close: its catch block is all thrown custom exceptions
	}
}