package Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LongestSubstring {
	public static void main(String[] args) {
		String str = " ";
		System.out.println(findUsingMap(str));
		System.out.println(solve(str));
	}

	private static int findLongestSubstring(String str) {
		int maxCount = 0;
		int l = 0;
		int r = 0;
		int count = 0;
		Stack<Character> stack = new Stack<Character>();
		while (l <= str.length() && r < str.length()) {
			if (!stack.contains(str.charAt(r))) {
				stack.push(str.charAt(r));
				count++;
				r++;
			} else {
				stack.clear();
				maxCount = Math.max(maxCount, count);
				count = 0;
				l++;
				r = l;
			}
		}
		return maxCount;
	}

	private static int findUsingMap(String str) {
		int maxCount = 0;
		int l = 0;
		int r = 0;
		int count = 0;
		Map<Character, Integer> map = new HashMap<>();
		while (l <= str.length() && r < str.length()) {
			if (!map.containsKey(str.charAt(r))) {
				map.put(str.charAt(r), 1);
				count++;
				r++;
			} else {
				map.clear();
				maxCount = Math.max(maxCount, count);
				count = 0;
				l++;
				r = l;
			}
		}
		return maxCount;
	}

	private static int solve(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		int left = 0, right = 0;
		int n = s.length();
		int len = 0;
		while (right < n) {
			if (map.containsKey(s.charAt(right)))
				left = Math.max(map.get(s.charAt(right)) + 1, left);

			map.put(s.charAt(right), right);

			len = Math.max(len, right - left + 1);
			right++;
		}
		return len;
	}
}
