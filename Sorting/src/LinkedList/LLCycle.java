package LinkedList;

import java.util.HashMap;

public class LLCycle {
	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = node.next.next.next;
		System.out.println(optimalApproach(node));
	}

	private static void printLL(Node node) {
		while (node != null) {
			System.out.println(node.num);
			node = node.next;
		}
	}

	private static boolean hasCycle(Node node) {
		Node temp = node;
		HashMap<Node, Integer> map = new HashMap<>();
		while (temp != null) {
			if (map.containsKey(temp)) {
				return true;
			} else {
				map.put(temp, 1);
			}
			temp = temp.next;
		}
		return false;
	}

	private static boolean optimalApproach(Node node) {
		Node fast = node;
		Node slow = node;
		while ((fast != null && fast.next != null)) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow)
				return true;

		}
		return false;
	}
}
