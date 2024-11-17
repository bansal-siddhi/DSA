package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
	public static void main(String[] args) {
		StackQueue stack = new StackQueue();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
	}

}

class StackQueue {
	Queue<Integer> stackQueue = new LinkedList<>();

	void push(int num) {
		stackQueue.add(num);
		for (int i = 0; i < stackQueue.size() - 1; i++) {
			int x = stackQueue.remove();
			stackQueue.add(x);
		}
	}

	int top() {
		return stackQueue.peek();
	}

	int pop() {
		return stackQueue.remove();
	}

	int size() {
		return stackQueue.size();
	}
}
