package DoublyLinkedList;

public class DoublyLL {
	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2, node, null);
		node.next.next = new Node(3, node.next, null);

		printDLL(node);
	}

	private static void printDLL(Node node) {
		while (node != null) {
			System.out.println(node.num);
			node = node.next;
		}
	}
}

class Node {
	int num;
	Node prev;
	Node next;

	public Node(int num) {
		this.num = num;
		this.prev = null;
		this.next = null;
	}

	public Node(int num, Node prev, Node next) {
		this.num = num;
		this.prev = prev;
		this.next = next;
	}
}
