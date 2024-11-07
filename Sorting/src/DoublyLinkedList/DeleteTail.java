package DoublyLinkedList;

public class DeleteTail {
	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2, node, null);
		node.next.next = new Node(3, node.next, null);
		node.next.next.next = new Node(4, node.next.next, null);

		node = deleteTail(node);
		printDLL(node);
	}

	private static void printDLL(Node node) {
		while (node != null) {
			System.out.println(node.num);
			node = node.next;
		}
	}

	private static Node deleteTail(Node node) {
		Node temp = node;
		while (temp.next.next != null) {
			temp = temp.next;
		}

		temp.next = null;
		temp.prev = null;

		return node;
	}
}
