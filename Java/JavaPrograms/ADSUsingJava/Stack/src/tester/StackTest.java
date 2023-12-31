package tester;

import java.util.Scanner;

import singly_linked_list.UsingSinglyList;

public class StackTest {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Stack: ");
			UsingSinglyList stack = new UsingSinglyList();
			boolean exit=false;
			while (!exit) {
				try {
					System.out.println("Operations\n1. Push\n2. Pop\n3. Top\n4. Get Max\n0. EXIT\n");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Push operations: ");
						System.out.println("Enter a value: ");
						stack.push(sc.nextInt());
						break;
					case 2:
						System.out.println("Pop operations: ");
						stack.pop();
						break;
					case 3:
						System.out.println("Top Data in stack is: ");
						stack.top();
						break;
					case 4:
						System.out.println("Get Max operations: ");
						stack.getMax();
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
