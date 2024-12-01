package prefix.infix.postfix;

import java.util.Stack;

public class PrefixToPostfix {
	public static void main(String[] args) {
		String str = "/-AB*+DEF";
		char[] c = reverseString(str.toCharArray());
		preficToPostfix(c);
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

	private static void preficToPostfix(char[] charArray) {
		Stack<String> stack = new Stack<String>();
		for (Character c : charArray) {
			if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '1' && c <= '9') {
				stack.push(c.toString());
			} else {
				String str2 = stack.pop();
				stack.push(str2 + stack.pop() + c.toString());
			}
		}
		System.out.println(stack);
	}
}
