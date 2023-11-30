package singly_linked_list;

public class UsingSinglyList {

	public static class Stack {
		private int data;
		private Stack next;

		public Stack(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}

	private Stack head;

	public void push(int data) {
		// 1. create a new node
		Stack newStack = new Stack(data);

		// special case 1: when list is empty
		if (head == null)
			head = newStack;
		// General case: list nodes already exists
		else {
			// 2. point next of new node to first node which is head
			newStack.next = head;

			// 3. and head point to new node
			head = newStack;
		}
	}

	public void pop() {
		// special case: if stack is empty
		if (head == null)
			System.out.println("Stack is empty:(");
		// general case: if stack is not empty
		else
			head = head.next;
	}

	public void top() {
		if(head == null) throw new RuntimeException("Stack is empty");
		System.out.println(head.data);
	}
	
	public void getMax() {
		if (head == null) {
			System.out.println("Stack is empty :(");
			return;
		} else {
			Stack trav = head;
			System.out.print("Stack: |");
			while (trav != null) {
				System.out.print(" |" + trav.data + "| ");
				trav = trav.next;
			}
			System.out.println(" |:");
		}
	}
}
