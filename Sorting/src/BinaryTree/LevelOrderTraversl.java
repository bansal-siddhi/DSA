package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversl {
	public static void main(String[] args) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.right.left = new Node(6);
		node.right.right = new Node(7);
		System.out.println(traverse(node));
	}

	public static List<List<Integer>> traverse(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();

		if (node == null)
			return list;
		queue.offer(node);
		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> subList = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				if (queue.peek().left != null)
					queue.add(queue.peek().left);
				if (queue.peek().right != null)
					queue.add(queue.peek().right);
				subList.add(queue.poll().data);
			}
			list.add(subList);
		}

		return list;
	}
}
