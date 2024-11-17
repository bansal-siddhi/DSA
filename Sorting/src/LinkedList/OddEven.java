package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class OddEven {
	public static void main(String[] args) {
		Node node = new Node(3);
		node.next = new Node(4);
		node.next.next = new Node(5);
		node.next.next.next = new Node(6);
		node.next.next.next.next = new Node(7);
		node.next.next.next.next.next = new Node(8);
//		oddEvenList(node);
		node = OptimalApproach(node);
		printLL(node);
	}

	private static void printLL(Node node) {
		while (node != null) {
			System.out.println(node.num);
			node = node.next;
		}
	}

	private static Node OptimalApproach(Node node) {
		Node odd = node;
		Node even = node.next;
		Node eveNode = node.next;
		while (even != null && even.next != null) {
			odd.next = odd.next.next;
			even.next = even.next.next;

			odd = odd.next;
			even = even.next;
		}
		odd.next = eveNode;
		return node;
	}

	private static Node oddEvenList(Node node) {
		List<Integer> list = new ArrayList<>();
		Node temp = node.next;

		while (temp != null && temp.next != null) {
			list.add(temp.num);
			temp = temp.next.next;
		}
		if (temp != null)
			list.add(temp.num);

		temp = node;
		while (temp != null && temp.next != null) {
			list.add(temp.num);
			temp = temp.next.next;
		}
		if (temp != null)
			list.add(temp.num);

		temp = node;
		int i = 0;
		while (temp != null) {
			temp.num = list.get(i);
			i++;
			temp = temp.next;
		}
//		System.out.println(list);
		return node;
	}
}
