package tester;

import java.util.Scanner;

import ADSLabExam2.SinglyLinkedList;

public class LLTest {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Singly Linked List: ");
			SinglyLinkedList ll = new SinglyLinkedList();
			boolean exit=false;
			while (!exit) {
				try {
					System.out.println("Operations\n1. Add last\n2. remove all\n3. Reverse\n4. Display all\n5. Add at Position\n0. EXIT\n");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Add last operations: ");
						System.out.println("Enter a value: ");
						ll.add(sc.nextInt());
						break;
					case 2:
						System.out.println("remove all operations: ");
						ll.removeAll();
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
