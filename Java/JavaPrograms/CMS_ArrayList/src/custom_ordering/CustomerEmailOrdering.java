package custom_ordering;

import java.util.Comparator;
import com.app.core.*;

public class CustomerEmailOrdering implements Comparator<Customer> {
	public int compare(Customer c1, Customer c2) {
		if (c1.getDateOfBirth().isBefore(c2.getDateOfBirth())) {
			return -1;
		} else if (c1.getDateOfBirth().isAfter(c2.getDateOfBirth())) {
			return 1;
		} else {
			return c1.getCustomerLastName().compareTo(c2.getCustomerLastName());
		}
	}
}
