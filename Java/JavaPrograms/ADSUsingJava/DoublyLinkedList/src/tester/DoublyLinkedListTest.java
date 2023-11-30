package tester;

import java.util.Scanner;

import my_list.DoublyLinkedListNode;

public class DoublyLinkedListTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedListNode list = new DoublyLinkedListNode();
		boolean exit = false;
		System.out.println("Doubly Linked List: ");
		while (!exit) {
			System.out.println("\nOption\n" + "1. display list\n" + "2. add last element\n" + "3. add first element\n"
					+ "4. add value at pos\n" + "5. delete first\n" + "6. delete all\n" + "7. delete at pos\n"
					+ "8. delete last\n" + "0. Exit");
			switch (sc.nextInt()) {
			case 1:
				list.displayAll();
				break;
			case 2:
				System.out.println("Enter last new element: ");
				list.addLast(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter new first element");
				list.addFirst(sc.nextInt());
				break;
			case 4:
				System.out.println("Enter position to be added: ");
				int pos = sc.nextInt();
				System.out.println("Enter value at that position: ");
				int val = sc.nextInt();
				list.addAtPos(val, pos);
				break;
			case 5:
				System.out.println("Delete first: ");
				list.deleteFirst();
				break;
			case 6:
				System.out.println("Delete all: ");
				list.deleteAll();
				break;
			case 7:
				System.out.println("Delete at position: ");
				System.out.println("Enter position: ");
				list.deleteAtPos(sc.nextInt());
				break;
			case 8:
				System.out.println("Delete first: ");
				list.deleteLast();
				break;
			case 0:
				exit = true;
				System.out.println("Exit :(");
				break;
			default:
				System.out.println("Invalid option...");
				break;
			}
		}
		sc.close();
	}
}