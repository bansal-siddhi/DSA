package prefix.infix.postfix;

import java.util.Stack;

public class InfixToPrefix {
	public static void main(String[] args) {
		String str = "A+B*C-D/E";
		char[] c = reverseString(str.toCharArray());
		StringBuilder sb = convertToPostfix(c);
		System.out.println(sb.reverse());
	}

	private static char[] reverseString(char[] c) {
		int start = 0;
		int end = c.length - 1;
		while (start <= end) {
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;
			end--;
		}
		return c;
	}

	private static StringBuilder convertToPostfix(char[] cArr) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for (char c : cArr) {
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
