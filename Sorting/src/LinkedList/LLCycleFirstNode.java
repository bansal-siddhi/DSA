package LinkedList;

public class LLCycleFirstNode {
	public static void main(String[] args) {
		Node node = new Node(3);
		node.next = new Node(2);
		node.next.next = new Node(0);
		node.next.next.next = new Node(-4);
		node.next.next.next.next = node.next;
		System.out.println(firstNode(node).num);
	}

	private static void printLL(Node node) {
		while (node != null) {
			System.out.println(node.num);
			node = node.next;
		}
	}

	private static Node firstNode(Node node) {
		if (node == null || node.next == null) {
			return null;
		}
		Node fast = node;
		Node slow = node;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				slow = node;
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}
}
