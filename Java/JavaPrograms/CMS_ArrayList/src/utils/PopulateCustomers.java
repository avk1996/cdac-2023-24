package utils;

import static java.time.LocalDate.*;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Customer;
import static com.app.core.Customer.*;
import com.app.core.ServicePlan;

public class PopulateCustomers {
	public static List<Customer> listReturn() {
		List<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer("Abhishek", "Kumbhar", "abhishek@cdac.in", "cdac1@123", 1000, parse("2015-10-10"),
				ServicePlan.SILVER));

		customerList.add(new Customer("Avishkar", "Hongekar", "avishkar@cdac.in", "cdac2@123", 8000,
				parse("2001-10-10"), ServicePlan.PLATINUM));

		customerList.add(new Customer("Avinash", "Honkar", "avinash@cdac.in", "cdac3@123", 2000, parse("1995-07-10"),
				ServicePlan.GOLD));

		customerList.add(new Customer("Vishal", "Karmarkar", "vishal@cdac.in", "cdac4@123", 5000, parse("1999-05-05"),
				ServicePlan.DIAMOND));

//		setCustomerId(Customer.getCustomerId() + 4);

		return customerList;
	}
}
