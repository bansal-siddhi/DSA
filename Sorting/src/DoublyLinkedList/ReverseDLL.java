package DoublyLinkedList;

public class ReverseDLL {
	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2, node, null);
		node.next.next = new Node(3, node.next, null);
		node.next.next.next = new Node(4, node.next.next, null);
		printDLL(node);
		System.out.println("After Reverse");
		node = reverseDLL(node);
		printDLL(node);
	}

	private static void printDLL(Node node) {
		while (node != null) {
			System.out.println(node.num);
			node = node.next;
		}
	}

	private static Node reverseDLL(Node node) {
		Node temp = node;
		Node prev = null;
		if (node == null || node.next == null)
			return node;
		while (temp != null) {
			prev = temp.prev;
			temp.prev = temp.next;
			temp.next = prev;
			temp = temp.prev;
		}
		return prev.prev;
	}
}
