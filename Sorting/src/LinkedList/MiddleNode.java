package LinkedList;

public class MiddleNode {
	public static void main(String[] args) {
		Node node = new Node(3);
		node.next = new Node(4);
		node.next.next = new Node(5);
//		node.next.next.next = new Node(6);
		int size = findLength(node);
		System.out.println("Size: " + tortoiseHareAlgo(node).num);
//		printLL(node);
	}

	private static void printLL(Node node) {
		while (node != null) {
			System.out.println(node.num);
			node = node.next;
		}
	}

	private static Node findMiddle(Node node, int size) {
		if (node == null || node.next == null)
			return node;
		Node temp = node;
		Node middle = null;
		int count = 0;
		while (temp != null) {

			if (count == size / 2) {
				middle = temp;
			}
			count++;
			temp = temp.next;
		}
		return middle;
	}

	private static int findLength(Node node) {
		if (node == null)
			return 0;
		Node temp = node;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	private static Node tortoiseHareAlgo(Node node) {
		if (node == null || node.next == null)
			return node;
		Node fast = node;
		Node slow = node;
		while (fast != null && fast.next != null && slow != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
}
