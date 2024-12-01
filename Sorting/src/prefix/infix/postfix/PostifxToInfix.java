package prefix.infix.postfix;

import java.util.Stack;

public class PostifxToInfix {
	public static void main(String[] args) {
		String str = "AB-DE+F*/";
		postfixToInfix(str.toCharArray());
	}

	private static void postfixToInfix(char[] cArr) {
		Stack<String> stack = new Stack<String>();
		for (Character c : cArr) {
			if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '1' && c <= '9') {
				stack.push(c.toString());
			} else {
				String str2 = stack.pop();
				stack.push("(" + stack.pop() + c.toString() + str2 + ")");
			}
		}
		System.out.println(stack.peek());
	}
}
