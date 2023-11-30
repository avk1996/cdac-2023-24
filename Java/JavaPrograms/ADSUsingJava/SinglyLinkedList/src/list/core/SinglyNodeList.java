package list.core;

public class SinglyNodeList {

	static class Node {
		// Node consist of data and reference to next node
		private int data;
		private Node next;

		// methods constructor to declare node
		// default Node
		public Node() {
			this.data = 0;
			this.next = null;
		}

		// Node
		public Node(int val) {
			this.data = val;
			this.next = null;
		}
	}

	private Node head;

	public SinglyNodeList() {
		this.head = null;// at first the node is pointing to null
		// when list is empty
	}

	public void listDisplay() {
		// if the list is empty head is pointing to null so we will first check weather
		// head is null or not
		// So here is exception
		if (head == null) {
			System.out.println("List is empty");
		} else {
			System.out.println("Lists: ");
			// To display a list we must know start and end
			// because to see the data of the list one must travase
			// through the list
			// so first we travarse by pointing to start
			Node trav = head;
			// end of list is pointed to null so we will traverse the loop
			// till we get null
			int i = 0;
			System.out.println("Index\tdata");
			while (trav != null) {
				++i;
				// main aim of display is to print all values of linked list
				// so here we first print data of first element
				System.out.println(i + "\t" + trav.data);
				// now have to move forward to next node
				// to do that we have to use next reference
				// which is reference of next node
				trav = trav.next;
			}
		}
	}

	public void listAddLast(int val) {
		// now we want to add a element at last
		// first of all when starting list is usually empty
		// we have to add an element to starting only
		// i.e., head: here is the step by step procedure to add last element
		// i. create new node using class node
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {
			Node trav = head;
			int i = 1;
			while (trav.next != null) {
//				System.out.println("Node " + i++);
//				System.out.println("Data: " + trav.data);
//				System.out.println("Data: " + trav.next);
				trav = trav.next;
			}
//			System.out.println("Node " + i++);
//			System.out.println("Data: " + trav.data);
//			System.out.println("Data: " + trav.next);
			trav.next = newNode;
		}
	}

	public void listAddFirst(int val) {
		// Now we need to add an element at first
		// 1. create a new node
		Node newNode = new Node(val);
		// 2 make before break
		// so head node pointing to first node will point to newNode
		newNode.next = head;
		// 3. new head is the reference/pointer of Node i.e., newNode
		head = newNode;
	}

	public void listAddAtPos(int val, int pos) {
		// 1. create a new node:
		Node newNode = new Node(val);
		// 2. go to the position to add an element
		Node trav = head;
		// special case 1: when the list is empty
		if (trav == null || pos <= 1) {
//			System.out.println("trav == null: " + (trav == null));
//			System.out.println("pos == 1: " + (pos == 1));
			newNode.next = head;
			head = newNode;
		} else {
			System.out.println("List exits more addition");
			for (int i = 1; i < pos - 1; i++) {
				// when position entered is larger than list index
				if (trav.next == null)
					break;
				trav = trav.next;
			}
			// make before break
			// 3. make
			newNode.next = trav.next;
			// 4. break
			trav.next = newNode;
		}
	}

	public void listFirstDelete() {
		if (head == null) {
			throw new RuntimeException("List is empty!");
		}
		head = head.next;
	}

	public void listAllDelete() {
		head = null;
	}

	public void listDeleteLast() {
		// special case 1: if list is empty
		if (head == null) {
			throw new RuntimeException("List is empty!");
		} else if (head.next == null) {
			head = null;
		} else {
			Node temp = null;
			Node trav = head;
			while (trav.next != null) {
				temp = trav;
				trav = trav.next;
			}
			temp.next = null;
		}
	}

	public void listDeleteAtPos(int pos) {
		// case 1: if position = 1 delete first node
		if (pos <= 1) {
			listFirstDelete();
		}
		// case 2: if list is empty
		else if (head == null) {
			throw new RuntimeException("List is empty!");
		}
		// traverse till pos
		// take temp pointer traversing behind trav
		else {
			Node temp = null;
			Node trav = head;

			for (int i = 1; i < pos; i++) {
				// case 3: if pos is beyond list size
				if (trav.next == null) {
					throw new RuntimeException("Cannot access invalid position...");
				}
				temp = trav;
				trav = trav.next;
			}

			// trav is node to be deleted & temp is node before that
			temp.next = trav.next;
			// trav node is garbage collected
		}
	}
}