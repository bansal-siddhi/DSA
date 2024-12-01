package prefix.infix.postfix;

import java.util.Stack;

public class InfixToPostfix {
	public static void main(String[] args) {
		String str = "A+B*C-D/E";
		System.out.println(convertToPostfix(str));
	}

	private static StringBuilder convertToPostfix(String str) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for (Character c : str.toCharArray()) {
			if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '1' && c <= '9') {
				sb.append(c);
			} else if (c == '(')
				stack.push(c);
			else if (c == ')') {
				while (!stack.empty() && stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && priority(c) <= priority(stack.peek())) {
					sb.append(stack.pop());
				}
				stack.push(c);
			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb;
	}

	private static int priority(Character c) {
		if (c == '^')
			return 3;
		else if (c == '*' || c == '/')
			return 2;
		else if (c == '+' || c == '-')
			return 1;
		return -1;
	}
}
