package Questions;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Question";
		char[] c = s.toCharArray();
		c = reverseSrting(c);
		for (char ch : c) {
			System.out.println(ch);
		}
	}

	private static char[] reverseSrting(char[] c) {
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
}
