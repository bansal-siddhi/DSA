package BinaryTree;

public class Main {
	public static void main(String[] args) {
		Node first = new Node(1);
		first.left = new Node(2);
		first.right = new Node(3);
		first.right.left = new Node(4);
	}
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
