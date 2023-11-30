package tester;

import static utils.ToyValidationRules.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import static utils.PopulateToys.*;

import com.app.core.Brand;
import com.app.core.Material;
import com.app.core.Name;
import com.app.core.PetsToy;

public class ToyManagementSystem {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<PetsToy> toyLists = populatedToys();

			boolean exit = false;
			while (!exit) {
				try {
					System.out.println(
							"Options: \n1. Add toy\n2. Check Toy availability\n3. Stock Listing Date\n4. Stock Update Date\n5. Apply discounts\n6. Remove 9 months older toys\n7. Apply discount 25% to 1 year old toys\n9. Display Stock\n0: EXIT");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Add toy: (toyNames,toyBrand,toyMaterial,toyPrice,toyListingDate)");
						PetsToy toys = validateToys(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								toyLists);
						toyLists.add(toys);
						System.out.println("Toy added successfully...");
						break;
					case 2:
						System.out.println("Check Toy availability");
						System.out.println("Enter toy Id: ");
						checkToyAvailability(sc.nextInt(), toyLists);
						break;
					case 3:
						System.out.println("Oldest Stock Listing Date");
						toyLists.sort((t2, t1) -> t1.getToyListingDate().compareTo(t2.getToyListingDate()));
						PetsToy oldest = toyLists.get(PetsToy.getPetNumber() - 1);
						System.out.println(oldest);
						break;
					case 4:
						System.out.println("Stock Update Date");
						System.out.println("Enter toy Id and update date: ");
						updateToyDate(sc.nextInt(), sc.next(), toyLists);
						break;
					case 5:
						System.out.println("Apply discounts");
						System.out.println("Enter toy Id and discount: ");
						applyDiscountToToy(sc.nextInt(), sc.nextDouble(), toyLists);
						break;
					case 6:
						System.out.println(" Remove 9 months older toys");
						removeOldToys(toyLists);
						break;
					case 7:
						System.out.println("Apply discount 25% to 1 year old toys");
						applyDiscountToOneYearToys(toyLists);
						break;
					case 9:
						System.out.println("Display stock");
						toyLists.forEach(t -> System.out.println(t));
						break;
					case 0:
						exit = true;
						break;

					default:
						System.out.println("Invalid option...");
						break;
					}
				} catch (Exception e) {
					System.out.println("In main exception");
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}
	}
}