package tester;

import java.util.Scanner;

import list.core.SinglyNodeList;

public class SinglyLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyNodeList list = new SinglyNodeList();
		boolean exit = false;
		while (!exit) {
			System.out.println("Option\n"
					+ "1. display list\n"
					+ "2. add last element\n"
					+ "3. add first element\n"
					+ "4. add value at pos\n"
					+ "0. Exit");
			switch (sc.nextInt()) {
			case 1:
				list.listDisplay();
				break;
			case 2:
				System.out.println("Enter last new element: ");
				list.listAddLast(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter new first element");
				list.listAddFirst(sc.nextInt());
				break;
			case 4:
				System.out.println("Enter position to be added: ");
				int pos = sc.nextInt();
				System.out.println("Enter value at that position: ");
				int val = sc.nextInt();
				list.listAddAtPos(val,pos);
				break;
			case 5:
				System.out.println("Delete first: ");
				list.listFirstDelete();
				break;
			case 6:
				System.out.println("Delete all: ");
				list.listAllDelete();
				break;
			case 7:
				System.out.println("Delete at position: ");
				System.out.println("Enter position: ");
				list.listDeleteAtPos(sc.nextInt());
				break;
			case 0: exit = true;
			System.out.println("Exit :(");
			break;
			default:
				break;
			}
		}
		sc.close();
	}
}