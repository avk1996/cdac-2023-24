package utils;

import java.util.List;
import custom_handling.*;
import app.com.core.*;

public class CricketerValidationRules {
	public static Cricketer validateCricketer(String cricketerName, int cricketerAge, String cricketerEmail,
			String cricketerPhoneNo, int cricketerRating, List<Cricketer> cricketerList)
			throws CricketerHandlingException {
		validateCricketerNumbers(Cricketer.getCricketerNumber());
		validateCricketerRatings(cricketerRating);
		CricketerNames newCricketerName = cricketerNamesValidity(cricketerName,cricketerList);
		return new Cricketer(newCricketerName, cricketerAge, cricketerEmail, cricketerPhoneNo, cricketerRating);
	}
	public static void validateCricketerNumbers(int cricketerNumber) throws CricketerHandlingException {
		if(cricketerNumber>5) {
			throw new CricketerHandlingException("DENIED: Can't add more players...");
		}	
	}
	public static void validateCricketerRatings(int crickterRating) throws CricketerHandlingException{
		if(crickterRating>10) {
			throw new CricketerHandlingException("DENIED: Rating within 10");
		}
	}
	public static CricketerNames cricketerNamesValidity(String cricketerName,List<Cricketer> cricketerList) throws IllegalArgumentException{
		return CricketerNames.valueOf(cricketerName.toUpperCase());
	}
	public static void modifyCricketerRating(int cricketerNumber, int cricketerRating, List<Cricketer> cricketerList)
			throws CricketerHandlingException {
		validateCricketerRatings(cricketerRating);
		for (Cricketer c : cricketerList) {
			if (cricketerNumber == c.getId()) {
				System.out.println("To be modified player: " + c);
				c.setCricketerRating(cricketerRating);
			}
		}
	}

	public static void searchCricketer(String cricketerName, List<Cricketer> cricketerList)
			throws CricketerHandlingException {
		CricketerNames newCricketerName = cricketerNamesValidity(cricketerName,cricketerList);
		for(Cricketer c: cricketerList) {
			if(c.getCricketerName().equals(newCricketerName)) {
				System.out.println(c);
			}
		}
	}
}
