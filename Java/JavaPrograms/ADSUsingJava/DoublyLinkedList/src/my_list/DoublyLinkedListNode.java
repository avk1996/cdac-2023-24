package my_list;

public class DoublyLinkedListNode {
	static class Node {
		private Node next;
		private Node previous;
		private int data;

		public Node() {
			this.next = null;
			this.previous = null;
			this.data = 0;
		}

		public Node(int data) {
			this.next = null;
			this.previous = null;
			this.data = data;
		}
	}

	Node head;

	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	public void displayAll() {
		/*
		 * special case 1: if list is empty throw exception or return silently general
		 * case 1: if list is filled(non-empty) 1. consider a pointer(trav) to first
		 * node 2. then traverse till last node
		 */
		if (isEmpty()) {
			System.out.println("List is empty...");
			return;
		}
		Node trav = head;
		System.out.print("head -> ");
		while (trav != null) {
			System.out.print(trav.data);
			System.out.print(" -> ");
			trav = trav.next;
		}
		System.out.print(" null");
	}

	public void addFirst(int val) {
		/*
		 * special case 1: if list is empty head is pointing to newNode general case:
		 * 1.create new node 2. newNodes next address must point to head(which is
		 * pointing at 1st node) 3. then head previous (i.e., first node) will store
		 * newNodes address which means first nodes previous has newNodes address 4. now
		 * we will make the head point to newNode which makes the newNode as first node
		 */
		Node newNode = new Node(val);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		}
	}

	public void addLast(int val) {
		/*
		 * special case 1: if list is empty then add a new node to head general case 1:
		 * 1. create a new node 2. go to last node by using a pointer named traverse 3.
		 * last node will be pointing to null so traverse till node.next == null 4. then
		 * last nodes next point to newNode. 5. newNodes previous will point to last
		 * node.
		 */
		if (isEmpty()) {
			addFirst(val);
		} else {
			Node newNode = new Node(val);
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.previous = trav;
		}
	}

	public void addAtPos(int val, int pos) {
		/*
		 * special case 1: if the list is empty add the node at first place
		 * general case: 
		 * 1. take position from user and value
		 * 2. create a new node
		 * 3. take a pointer at head (i.e., first node) and traverse till last second position node
		 * 4. 
		 * */
		if (isEmpty() || pos<=1) {
			addFirst(val);
		}
		else {
			Node newNode = new Node(val);	
			Node trav = head;
			for(int i=1;i<pos-1;i++) {
				if (trav.next == null){
					System.out.println("List postion out of bounds\nadding node at last");
					break;
				}
				trav = trav.next;
			}
			//first attach to two chains
			newNode.next = trav.next;
			newNode.previous = trav;
			
			//then cut the old connections
			if (trav.next != null)//this condition to make sure that trav must not refer to invalid position
				trav.next.previous = newNode;
			trav.next = newNode;
		}
	}
	public void deleteFirst() {
		/*
		 * 1. special case: if list is empty
		 * 2. special case: if list contains only one node
		 * 3. general case
		 * i. point head to next node
		 * ii. de-reference the first node next address
		 * iii. de-reference current node (pointed by head) using null*/
		if(isEmpty()) {
			System.out.println("List is already empty\nSuggestion: view list before deleting");
			return;
		}
		else if(head.next == null) {
			head = null;
		}
		else {
			head = head.next;
			head.previous.next = null;
			head.previous = null;
		}
	}
	public void deleteLast() {
		/*
		 * special case: if list is empty
		 * special case: if list consist of only one node
		 * general case:
		 * i. Point a pointer to last node by traversing
		 * ii. then de-reference the last second position
		 * iii. then de-reference the 
		 * */
		if(isEmpty()) {
			System.out.println("List is already empty\nSuggestion: view list before deleting");
			return;
		}
		else if(head.next == null) {
			head = null;
		}
		else {
			Node trav = head;
			while(trav.next!=null) 
				trav = trav.next;
			trav.previous.next = null;
			trav.previous = null;
		}
	}
	
	public void deleteAtPos(int pos) {
		if(isEmpty()) {
			System.out.println("List is already empty\nSuggestion: view list before deleting");
			return;
		}
		else if(head.next == null) {
			
		}
		else {
			Node temp = null;
			Node trav = head;
			for(int i=1;i<pos;i++) {
				temp = trav;
				trav = trav.next;
			}
			//make
			temp.next = trav.next;
			trav.next.previous = temp;
			
			//break next
			trav.next.previous = null;
			trav.next = null;
			
			//break previous
			temp.next.previous = null;
			temp.next = null;
		}
	}
	
	public void deleteAll() {
		head = null;
	}
}