package tester;

import static utils.CricketerValidationRules.modifyCricketerRating;
import static utils.CricketerValidationRules.searchCricketer;
import static utils.CricketerValidationRules.validateCricketer;
import static utils.PopulateCricketers.populateCricketers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import app.com.core.Cricketer;

public class CrickterManagementSystem {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Cricketer> cricketerList = populateCricketers();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Options:" + "\n1. Add player" + "\n2. Modify player rating"
							+ "\n3. Search cricketer by name" + "\n4. Display all cricketers"
							+ "\n5. Display all cricketers by rating order" + "\n0: EXIT");
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Add players: String cricketerName, int cricketerAge, String cricketerEmail, String cricketerPhoneNo,\n"
										+ "cricketerRating");
						Cricketer cricketPlayer = validateCricketer(sc.next(), sc.nextInt(), sc.next(), sc.next(),
								sc.nextInt(), cricketerList);
						cricketerList.add(cricketPlayer);
						System.out.println("Crickete player added successfully");
						break;
					case 2:
						System.out.println("Modify player rating");
						System.out.println("Enter cricketer player number and rating: ");
						modifyCricketerRating(sc.nextInt(), sc.nextInt(), cricketerList);
						break;
					case 3:
						System.out.println("Search cricketer by name");
						searchCricketer(sc.next(), cricketerList);
						break;
					case 4:
						System.out.println("Display all cricketers");
						cricketerList.forEach(c -> System.out.println(c));
						break;
					case 5:
						System.out.println("Display all cricketers by rating order");
						Collections.sort(cricketerList,Comparator.comparingInt(Cricketer::getCricketerRating));
						cricketerList.forEach(c -> System.out.println(c));
						break;
					case 0:
						System.out.println("EXIT");
						exit = true;
						break;
					default:
						System.out.println("Invalid option selected...");
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}
	}
}
