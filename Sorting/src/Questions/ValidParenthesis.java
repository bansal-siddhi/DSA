package Questions;

import java.util.Stack;

public class ValidParenthesis {
	public static void main(String[] args) {
		String str = "( )[ { } (  ]";
		System.out.println(isValid(str));
	}

	private static boolean isValid(String str) {
		Stack<Character> stack = new Stack<>();
		for (Character c : str.toCharArray()) {
			if (c.equals('{') || c.equals('[') || c.equals('('))
				stack.push(c);
			else {
				if (c.equals('}') && !stack.pop().equals('{'))
					return false;
				else if (c.equals(']') && !stack.pop().equals('['))
					return false;
				else if (c.equals(')') && !stack.pop().equals('('))
					return false;
			}
		}
		return stack.empty();
	}
}
