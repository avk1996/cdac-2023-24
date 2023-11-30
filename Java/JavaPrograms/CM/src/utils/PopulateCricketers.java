package utils;

import java.util.ArrayList;
import java.util.List;

import app.com.core.Cricketer;
import static app.com.core.CricketerNames.*;
public class PopulateCricketers {
	
	public static List<Cricketer> populateCricketers() {
		List<Cricketer> cricketer = new ArrayList<>();
		cricketer.add(new Cricketer(VIRAT, 37, "viratKholi18@bcci.in", "+91 12345",10));
		cricketer.add(new Cricketer(SACHIN, 48, "sachin10@bcci.in", "+91 54321",10));
		cricketer.add(new Cricketer(SEHVAG, 36, "ravindra33@bcci.in", "+91 54323",7));
		cricketer.add(new Cricketer(DHONI, 42, "MSDhoni7@bcci.in", "+91 54327",9));
//		cricketer.add(new Cricketer(ROHIT, 39, "rohit45@bcci.in", "+91 54345",8));
		return cricketer;
	}
	
}
