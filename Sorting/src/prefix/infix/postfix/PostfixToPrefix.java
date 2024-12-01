package prefix.infix.postfix;

import java.util.Stack;

public class PostfixToPrefix {
	public static void main(String[] args) {
		String str = "AB-DE+F*/";
		postfixToPrefix(str.toCharArray());
	}

	private static void postfixToPrefix(char[] charArray) {
		Stack<String> stack = new Stack<String>();
		for (Character c : charArray) {
			if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '1' && c <= '9') {
				stack.push(c.toString());
			} else {
				String str2 = stack.pop();
				stack.push(c.toString() + stack.pop() + str2);
			}
		}
		System.out.println(stack.peek());
	}
}
