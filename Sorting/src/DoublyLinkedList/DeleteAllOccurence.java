package DoublyLinkedList;

public class DeleteAllOccurence {
	public static void main(String[] args) {
		Node node = new Node(2);
		node.next = new Node(2, node, null);
		node.next.next = new Node(3, node.next, null);
		node.next.next = new Node(4, node.next.next, null);
		node.next.next.next = new Node(2, node.next.next.next, null);
		node = deleteAllOccurences(node, 2);
		printDLL(node);
	}

	private static void printDLL(Node node) {
		while (node != null) {
			System.out.println(node.num);
			node = node.next;
		}
	}

	private static Node deleteAllOccurences(Node node, int num) {
		Node prev = null;
		Node temp = node;
		while (temp != null) {
			if (temp.num == num) {
				if (temp == node) {
					node = node.next;
					prev = temp;
				} else {
					prev.next = temp.next;
					temp.prev = prev;
				}
				temp = temp.next;
			} else {
				prev = temp;
				temp = temp.next;
			}
		}
		return node;
	}
}
