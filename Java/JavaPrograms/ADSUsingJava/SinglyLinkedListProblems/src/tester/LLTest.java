package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import coreLL.SinglyLinkedList;

public class LLTest {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Singly Linked List: ");
			SinglyLinkedList ll = new SinglyLinkedList();
			List<Integer> intList = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Operations\n1. Add last\n2. remove all\n3. Reverse\n"
							+ "4. Display all\n5. Add at Position\n6. Add at once\n"
							+ "7. Remove a number and its duplicates\n"
							+ "8. Check palindrom\n"
							+ "0. EXIT\n");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Add last operations: ");
						System.out.println("Enter a value: ");
						ll.add(sc.nextInt());
						break;
					case 2:
						System.out.println("remove all operations: ");
						ll.removeAll();
						intList.clear();
						break;
					case 3:
						System.out.println("Reverse list: ");
						ll.reverse();
						break;
					case 4:
						System.out.println("Display all: ");
						ll.list();
						break;
					case 5:
						System.out.println("Add at postion");
						System.out.println("Enter data and postion: ");
						ll.add(sc.nextInt(), sc.nextInt());
						break;
					case 6:
						System.out.println("Enter the number of integer elements you want to add: ");
						int n = sc.nextInt();
						for (int i = 0; i < n; i++) {
							System.out.println("Enter element " + (i + 1) + " :");
							intList.add(i, sc.nextInt());
						}
						ll.addAll(intList);
						break;
					case 7:
						System.out.println("Remove a number and its duplicates");
						System.out.println("Enter a number you want to delete: ");
						ll.removeElements(sc.nextInt());
						break;
					case 8:
						System.out.println("find if the linked list is palindrom or not");
						if(ll.isPalindrome())
							System.out.println("Given linked list is palindrom");
						else
							System.out.println("Given linked list is NOT palindrom");
						break;
					case 0:
						System.out.println("Exit");
						exit = true;
						break;
					default:
						System.out.println("Invalid Option");
						break;
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
				}
			}
		}
	}
}
