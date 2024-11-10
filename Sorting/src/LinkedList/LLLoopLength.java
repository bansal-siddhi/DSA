package LinkedList;

public class LLLoopLength {
	public static void main(String[] args) {
		Node node = new Node(3);
		node.next = new Node(2);
		node.next.next = new Node(0);
		node.next.next.next = new Node(-4);
		node.next.next.next.next = node.next;
		System.out.println(firstNode(node));
	}

	private static void printLL(Node node) {
		while (node != null) {
			System.out.println(node.num);
			node = node.next;
		}
	}

	private static int firstNode(Node node) {
		if (node == null || node.next == null) {
			return 0;
		}
		Node fast = node;
		Node slow = node;
		int count = 0;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				fast = fast.next;
				while (fast != slow) {
					count++;
					fast = fast.next;
				}
				return count + 1;
			}
		}
		return count;
	}
}
