package LinkedList;

public class OddEven {
	public static void main(String[] args) {
		Node node = new Node(3);
		node.next = new Node(4);
		node.next.next = new Node(5);
		node.next.next.next = new Node(6);
	}

	private static void printLL(Node node) {
		while (node != null) {
			System.out.println(node.num);
			node = node.next;
		}
	}
}
