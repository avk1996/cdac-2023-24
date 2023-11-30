package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ADSLabExam2.SortedInSLL;

public class SLLTest {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Integer> intList = new ArrayList<>();			
			boolean exit = false;
			SortedInSLL newList = new SortedInSLL();
			while(!exit) {
			try {
					System.out.println("\nOption\n1. Add sorted\n2. Display all\n3. Add all\n4. Using toString\n5. Remove at pos\n0. Exit\n");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter a new node value");
						newList.addSorted(sc.nextInt());
						break;
					case 2:
						System.out.println("Display all: ");
						newList.displayAll();
						break;
					case 3:
						System.out.println("Add all");
						System.out.println("Enter the number of integer elements you want to add: ");
						int n = sc.nextInt();
						for(int i=0;i<n;i++) {
							System.out.println("Enter element "+(i+1)+" :");
							intList.add(i,sc.nextInt());
						}
						newList.addAll(intList);
						break;
					case 4:
						System.out.println();
						break;
					case 5:
						System.out.println("Remove at position: ");
						newList.remove(sc.nextInt());
						break;
					case 0:
						System.out.println("Bye");
						exit = true;
						break;

					default:
						System.out.println("Invalid choice:(");
						break;
					}

			} catch (Exception e) {
//				System.out.println(e.getMessage());
				e.printStackTrace();
				sc.nextLine();
			}
		}

		}
	}
}
