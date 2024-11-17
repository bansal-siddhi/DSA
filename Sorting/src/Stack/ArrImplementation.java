package Stack;

public class ArrImplementation {
	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println(stack.size());
		System.out.println(stack.pop());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.size());
	}

}

class Stack {
	int arr[] = new int[1000];
	int top = -1;

	void push(int num) {
		top++;
		arr[top] = num;
	}

	int pop() {
		if (top != -1) {
			int x = arr[top];
			top--;
			return x;
		}
		return -1;
	}

	int top() {
		return top;
	}

	int size() {
		return top + 1;
	}
}
