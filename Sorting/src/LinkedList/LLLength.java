package LinkedList;

public class LLLength {
	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);

		System.out.println(lengthOfLL(node));
	}

	private static int lengthOfLL(Node node) {
		int count = 0;
		while (node != null) {
			count++;
			node = node.next;
		}
		return count;
	}
}
