package LinkedList;

public class ReverseLL {
	public static void main(String[] args) {
		Node node = new Node(3);
		node.next = new Node(4);
		node.next.next = new Node(5);
		node.next.next.next = new Node(6);
		node = recursion(node);
		printLL(node);
	}

	private static void printLL(Node node) {
		while (node != null) {
			System.out.println(node.num);
			node = node.next;
		}
	}

	private static Node reverseLL(Node node) {
		Node temp = node;
		Node prev = null;
		while (temp != null) {
			Node front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
		}

		return prev;
	}

	private static Node recursion(Node node) {
		if (node == null || node.next == null)
			return node;

		Node temp = recursion(node.next);
		Node front = node.next;
		front.next = node;
		node.next = null;

		return temp;
	}
}
