package ADSLabExam2;


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
}