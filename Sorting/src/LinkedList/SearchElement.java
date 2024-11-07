package LinkedList;

public class SearchElement {
	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);

		System.out.println(searchElement(node, 0));
		System.out.println(searchElement(node, 1));

	}

	private static boolean searchElement(Node node, int num) {
		boolean found = false;
		Node temp = node;
		while (temp != null) {
			if (temp.num == num)
				found = true;
			temp = temp.next;
		}
		return found;
	}
}
