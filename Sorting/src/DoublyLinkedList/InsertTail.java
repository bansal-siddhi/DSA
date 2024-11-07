package DoublyLinkedList;

public class InsertTail {
	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2, node, null);
		node.next.next = new Node(3, node.next, null);

		node = insertAtEnd(node, 10);
		printDLL(node);
	}

	private static void printDLL(Node node) {
		while (node != null) {
			System.out.println(node.num);
			node = node.next;
		}
	}

	private static Node insertAtEnd(Node node, int k) {
		Node temp = node;
		while (temp.next != null) {
			temp = temp.next;
		}

		Node newNode = new Node(k);
		temp.next = newNode;
		newNode.prev = temp;
		return node;
	}
}
