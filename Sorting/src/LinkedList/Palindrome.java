package LinkedList;

public class Palindrome {
	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
//		node.next.next = new Node(2);
//		node.next.next.next = new Node(1);
//		node.next.next.next.next = new Node(1);
		Node middleNode = middleElement(node);
		Node revLL = revLL(middleNode.next);
		System.out.println(isPalindrome(node, revLL));
		printLL(revLL);
	}

	private static void printLL(Node node) {
		while (node != null) {
			System.out.println(node.num);
			node = node.next;
		}
	}

	private static Node revLL(Node node) {
		if (node == null || node.next == null)
			return node;
		Node temp = revLL(node.next);
		Node front = node.next;
		front.next = node;
		node.next = null;

		return temp;
	}

	private static Node middleElement(Node node) {
		Node fast = node;
		Node slow = node;
		while (fast.next.next != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	private static boolean isPalindrome(Node node, Node revNode) {
		if (node == null || node.next == null) {
			return true;
		}
		Node first = node;
		Node last = revNode;

		while (last != null) {
			if (first.num != last.num) {
				revLL(revNode);
				return false;
			}

			first = first.next;
			last = last.next;
		}
		revLL(revNode);
		return true;
	}
}
