package prefix.infix.postfix;

import java.util.Stack;

public class PrefixToInfix {
	public static void main(String[] args) {
		String str = "*+PQ-MN";
		char[] c = reverseString(str.toCharArray());
		prefixToInfix(c);
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

	private static void prefixToInfix(char[] cArr) {
		Stack<String> stack = new Stack<String>();
		for (Character c : cArr) {
			if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '1' && c <= '9') {
				stack.push(c.toString());
			} else {
				String str2 = stack.pop();
				stack.push("(" + str2 + c.toString() + stack.pop() + ")");
			}
		}
		System.out.println(stack.peek());
	}
}
