package tester;

import static custom_exceptions.PenValidationRules.specificPenStock;
import static custom_exceptions.PenValidationRules.updatePenStock;
import static custom_exceptions.PenValidationRules.*;
import static utils.PopulatePenStock.populatePens;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.core.StyleWithPens;

import custom_ordering.OrderByBrand;
import custom_ordering.OrderByDate;
import custom_ordering.OrderByType;

public class PenManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<StyleWithPens> penList = populatePens();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("-------Stylish Pen Online-------");
					System.out.println("1. Add pen stock\n" + "2. See all pen stock\n" + "3. update stock\n"
							+ "4. get specific stock\n" + "5. Sort by choice\n" + "6. Give discount\n"
							+ "7. Remove record older than 9 months\n" + "0. EXIT");

					switch (sc.nextInt()) {
					case 1:
						System.out.println("Add pen:\n" + "penId,penBrand,penType,penInkColor,penStock,penPrice,\n"
								+ "penListingDate\n");
						StyleWithPens pen = validatePens(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextInt(),
								sc.nextDouble(), sc.next(), penList);
						penList.add(pen);
						System.out.println("Pen added successfully...");
						break;
					case 2:
						System.out.println("see all pen");
//						penList.stream().forEach(p->System.out.println(p));//using lambda function
						penList.stream().forEach(System.out::println);// using lambda function and method reference

						break;
					case 3:
						System.out.println("Update");
						System.out.println("Enter pen ID and pen its stock number to update: ");
						updatePenStock(sc.nextInt(), sc.nextInt(), penList);
						break;
					case 4:
						System.out.println("get specific stock");
						System.out.println("Enter pen ID: ");
						StyleWithPens specificPen = specificPenStock(sc.nextInt(), penList);
						System.out.println(specificPen);
						break;
					case 5:
						System.out.println("Sort by choice:\n1. Date\n2. Brand\n3.Price\n4. Material type");
						int ch = sc.nextInt();
						if (ch == 1)
							Collections.sort(penList, new OrderByDate());
						else if (ch == 2)
							Collections.sort(penList, new OrderByBrand());
						else if (ch == 3)
							Collections.sort(penList, Comparator.comparingDouble(StyleWithPens::getPenPrice));
						else if (ch == 4)
							Collections.sort(penList, new OrderByType());

						penList.forEach(p -> System.out.println(p));
						break;
					case 6:
						System.out.println("Apply discount: ");
						applyDiscountToPens(penList);
						break;
					case 7:
						System.out.println("Older items removed: ");
						removeOldPens(penList);
						break;
					case 0:
						System.out.println("EXIT");
						exit = true;
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
				} catch (Exception e) {
					System.out.println("In main exception...");
					System.out.println(e.getLocalizedMessage());
					e.printStackTrace();
					sc.nextLine();
				} // catch
			} // while
		} // 1st try block
	}
}