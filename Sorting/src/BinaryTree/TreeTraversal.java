package BinaryTree;

public class TreeTraversal {
	public static void main(String[] args) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.left.right.left = new Node(8);
		node.right = new Node(3);
		node.right.left = new Node(6);
		node.right.right = new Node(7);
		node.right.right.left = new Node(9);
		node.right.right.right = new Node(10);
		System.out.println("Preorder: ");
		preOrder(node);
		System.out.println("Inorder: ");
		inOrder(node);
		System.out.println("Postorder: ");
		postOrder(node);
	}

	public static void preOrder(Node node) {
		if (node == null) {
			return;
		}

		System.out.println(node.data);
		preOrder(node.left);
		preOrder(node.right);
	}

	public static void postOrder(Node node) {
		if (node == null)
			return;

		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);
	}

	public static void inOrder(Node node) {
		if (node == null)
			return;

		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
	}
}
