package coreLL;

import java.util.List;

public class SinglyLinkedList {
	static class Node {
		private int data;
		private Node next;

		// new node
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}

	}

	private Node head;

	public void add(int value) {
		Node newNode = new Node(value);
		if (isEmpty())
			head = newNode;
		else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newNode;
		}

	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	public void removeAll() {
		head = null;
	}

	public void list() {
		if (isEmpty())
			throw new RuntimeException("Stack is empty..");
		else {
			Node trav = head;
			System.out.print("head");
			while (trav != null) {
				System.out.print(" -> " + trav.data);
				trav = trav.next;
			}
			System.out.println(" -> null");
		}
	}

	public void add(int value, int pos) {
		Node newNode = new Node(value);
		if (isEmpty())
			head = newNode;
		else if (head.next == null || pos <= 1) {
			newNode.next = head;
			head = newNode;
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				if (trav.next == null)
					break;
				trav = trav.next;
			}
			// add last and check condtion
			newNode.next = trav.next;
			trav.next = newNode;

		}
	}

	public void reverse() {
		// TODO Auto-generated method stub
		Node following = head;
		Node current = head;
		Node previous = null;
		if (isEmpty()) {
			throw new RuntimeException("List is Empty...");
		} else {
			while (current != null) {
				following = following.next;
				current.next = previous;
				previous = current;
				current = following;
			}
			head = previous;
		}
	}

	public void addAll(List<Integer> intList) {
		for (int i = 0; i < intList.size(); i++) {
			add(intList.get(i));
		}
	}

	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
	 * ListNode next) { this.val = val; this.next = next; } }
	 */
	public Node removeElements(int val) {
		if (head == null)
			return head;
		else if (head.next == null) {
			if (head.data == val)
				head = null;
			return head;
		} else {
			Node trav = head;
			while (trav.next != null) {
				if (trav.next.data == val) {
					trav.next = trav.next.next;
					trav = head;
				} else
					trav = trav.next;
			}
			if (head.data == val) {
				if (head.next == null) {
					head = null;
					System.out.println("general: single node");
				} else {
					head.next = head.next.next;
					System.out.println("general: multiple node");
				}
			}
			return head;
		}
	}

}