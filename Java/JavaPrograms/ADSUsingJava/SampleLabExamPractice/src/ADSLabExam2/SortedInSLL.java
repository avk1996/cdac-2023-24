package ADSLabExam2;

import java.util.List;

public class SortedInSLL {
	private static class Node {
		private Node next;
		private int data;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}

	}

	private Node head;

	public boolean isEmptyList() {
		if (head == null)
			return true;
		else
			return false;
	}

	public void addSorted(int data) {
		Node newNode = new Node(data);
		if (isEmptyList())
			head = newNode;
		else if (head.next == null) {
			if (data >= head.data)
				addLast(data);
			else
				addFirst(data);
		}
//		special case if a element is smaller than head element
		else if (data <= head.data) {
			System.out.println("before head...");
			addFirst(data);
		} else {
			Node trav = head;
			Node temp = null;
			while (trav != null) {
				if (data >= trav.data) {
					temp = trav;
					trav = trav.next;
				} else
					break;
			}
			newNode.next = trav;
			temp.next = newNode;
		}
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (isEmptyList())
			head = newNode;
		else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newNode;
		}
	}

	public void addFirst(int data) {

		Node newNode = new Node(data);
		if (isEmptyList())
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void displayAll() {
		if (isEmptyList())
			throw new RuntimeException("List is empty...");
		else {
			Node trav = head;
			System.out.print("head ");
			while (trav != null) {
				System.out.print("->" + trav.data);
				trav = trav.next;
			}
			System.out.print("-> Null");
		}
	}

	public void addAll(List<Integer> intList) {
		for (int i = 0; i < intList.size(); i++) {
			addSorted(intList.get(i));
		}
	}

	public void remove(int nextInt) {
		if (isEmptyList())
			throw new RuntimeException("List is empty...");
		else if (head.next == null || nextInt <= 1)
			head = head.next;
		else {
			Node trav = head;
			for (int i = 1; i < nextInt - 1; i++) {
				if(trav.next.next == null)
					break;
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}

}
