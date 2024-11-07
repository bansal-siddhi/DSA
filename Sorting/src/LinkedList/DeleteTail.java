package LinkedList;

public class DeleteTail {
	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);

		node = deleteLast(node);
		printLL(node);
	}

	private static void printLL(Node node) {
		while (node != null) {
			System.out.println(node.num);
			node = node.next;
		}
	}

	private static Node deleteLast(Node node) {
		Node temp = node;
		while (temp.next.next != null)
			temp = temp.next;

		temp.next = null;

		return node;
	}
}
