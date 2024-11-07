package LinkedList;

public class InsertHead {

	public static void main(String[] args) {
		Node node = new Node(3);
		node.next = new Node(4);
		node.next.next = new Node(5);
		node.next.next.next = new Node(6);

		node = insertAtFirst(node, 2);
		printLL(node);
	}

	private static void printLL(Node node) {
		while (node != null) {
			System.out.println(node.num);
			node = node.next;
		}
	}

	private static Node insertAtFirst(Node node, int num) {
		// time complexity:O(1)
		Node head = new Node(num, node);
		return head;
	}
}

class Node {
	int num;
	Node next;

	Node(int num, Node next) {
		this.num = num;
		this.next = next;
	}

	Node(int num) {
		this.num = num;
		this.next = null;
	}
}
