package Stack;

public class LLImpl {
	public static void main(String[] args) {
		LLStack stack = new LLStack();
		stack.push(10);
		System.out.println("Size: " + stack.size());
		stack.push(20);
		System.out.println("Size: " + stack.size());
		stack.push(30);
		System.out.println("Size: " + stack.size());
		stack.push(40);
		System.out.println("Size: " + stack.size());
		System.out.println("POP: " + stack.pop());
		System.out.println("Size: " + stack.size());
	}
}

class LLStack {

	private class LLNode {
		int num;
		LLNode next;

		public LLNode(int num) {
			this.num = num;
			this.next = null;
		}
	}

	LLNode top;
	int size;

	LLStack() {
		this.top = null;
		size = 0;
	}

	void push(int num) {
		LLNode node = new LLNode(num);
		node.next = top;
		top = node;
		size++;
	}

	int pop() {
		if (top == null)
			return -1;
		int data = top.num;
		top = top.next;
		size--;
		return data;
	}

	int size() {
		return size;
	}

}